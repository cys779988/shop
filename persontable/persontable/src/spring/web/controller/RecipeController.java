package spring.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import spring.web.svc.RecipeService;
import spring.web.svc.ReplyService;
import spring.web.util.FileUtils;
import spring.web.vo.RecipeVO;
import spring.web.vo.MemberVO;
import spring.web.vo.PageMaker;
import spring.web.vo.RecipeReplyListVO;
import spring.web.vo.RecipeReplyVO;
import spring.web.vo.SearchCriteria;

@Controller
@RequestMapping("/recipe/*")
public class RecipeController {
	@Autowired
	private RecipeService recipeService;

	@Resource(name = "uploadPath")
	private String uploadPath;
	
	@Autowired
	ReplyService replyService;

	/* 관리자 식재료 목록페이지로 이동 */
	@RequestMapping("/recipe/admin_recipe_list")
	public String adminrecipeList(Model model, RecipeVO vo, @ModelAttribute("scri") SearchCriteria scri) {
		List<RecipeVO> recipeList = recipeService.recipeList(scri);
		model.addAttribute("recipeList", recipeList);

		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(scri);
		pageMaker.setTotalCount(recipeService.listCount(scri));

		model.addAttribute("pageMaker", pageMaker);
		return "recipe/admin_recipe_list";
	}

	/* 관리자 식재료 등록페이지로 이동 */
	@RequestMapping("/recipe/admin_recipe_regist")
	public void adminRecipeWriteView(Model model) {

	}

	/* 식재료 등록 */

	@RequestMapping("/recipe/recipeRegister")
	public String adminRecipeRegister(RecipeVO vo, MultipartFile file) throws Exception {

		String imgUploadPath = uploadPath + File.separator + "imgUpload";
		String ymdPath = FileUtils.calcPath(imgUploadPath);
		String fileName = null;

		if (file.getOriginalFilename() != null && file.getOriginalFilename() != "") {
			fileName = FileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath);

			vo.setRecipeImg(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
			// gdsThumbImg에 썸네일 파일 경로 + 썸네일 파일명 저장
			vo.setRecipeThumbImg(
					File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);
		} else {
			fileName = File.separator + "images" + File.separator + "none.png";
			// 미리 준비된 none.png파일을 대신 출력함

			vo.setRecipeImg(fileName);
			vo.setRecipeThumbImg(fileName);
		}

		vo.setRecipeImg(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
		vo.setRecipeThumbImg(
				File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);

		recipeService.recipeRegister(vo);
		return "redirect:/recipe/admin_recipe_list";
	}

	// ck 에디터에서 파일 업로드
	@RequestMapping(value = "/ckUpload", method = RequestMethod.POST)
	public void postCKEditorImgUpload(HttpServletRequest req, HttpServletResponse res,
			@RequestParam MultipartFile upload) throws Exception {
		// 랜덤 문자 생성
		UUID uid = UUID.randomUUID();

		OutputStream out = null;
		PrintWriter printWriter = null;

		// 인코딩
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");

		try {

			String fileName = upload.getOriginalFilename(); // 파일 이름 가져오기
			byte[] bytes = upload.getBytes();

			// 업로드 경로
			String ckUploadPath = uploadPath + File.separator + "ckUpload" + File.separator + uid + "_" + fileName;

			out = new FileOutputStream(new File(ckUploadPath));
			out.write(bytes);
			out.flush(); // out에 저장된 데이터를 전송하고 초기화

			String callback = req.getParameter("CKEditorFuncNum");
			printWriter = res.getWriter();
			String fileUrl = "/ckUpload/" + uid + "_" + fileName; // 작성화면

			// 업로드시 메시지 출력
			printWriter.println("<script type='text/javascript'>" + "window.parent.CKEDITOR.tools.callFunction("
					+ callback + ",'" + fileUrl + "','이미지를 업로드하였습니다.')" + "</script>");

			printWriter.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (printWriter != null) {
					printWriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return;
	}
	/* 관리자 식재료 조회 페이지로 이동 */

	@RequestMapping(value = "/recipe/admin_recipe_view")
	public String read(@RequestParam("n") int recipeNum, @ModelAttribute("scri") SearchCriteria scri, Model model) {
		RecipeVO recipe = recipeService.recipeView(recipeNum);
		model.addAttribute("recipe", recipe);
		model.addAttribute("scri", scri);
		return "recipe/admin_recipe_view";
	}

	/* 관리자 식재료 수정 페이지로 이동 */
	@RequestMapping(value = "/recipe/recipeModify")
	public String updateView(@RequestParam("n") int recipeNum, @ModelAttribute("scri") SearchCriteria scri, Model model) {

		RecipeVO recipe = recipeService.recipeView(recipeNum);
		model.addAttribute("recipe", recipe);
		model.addAttribute("scri", scri);

		return "recipe/admin_recipe_update";
	}

	// 식재료 수정
	@RequestMapping(value = "/recipe/modify")
	public String update(RecipeVO vo, MultipartFile file, HttpServletRequest req,
			@ModelAttribute("scri") SearchCriteria scri, RedirectAttributes rttr) throws Exception {

		// 새로운 파일이 등록되었는지 확인
		if (file.getOriginalFilename() != null && file.getOriginalFilename() != "") {
			// 기존 파일을 삭제
			new File(uploadPath + req.getParameter("recipeImg")).delete();
			new File(uploadPath + req.getParameter("recipeThumbImg")).delete();

			// 새로 첨부한 파일을 등록
			String imgUploadPath = uploadPath + File.separator + "imgUpload";
			String ymdPath = FileUtils.calcPath(imgUploadPath);
			String fileName = FileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath);

			vo.setRecipeImg(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
			vo.setRecipeThumbImg(
					File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);

		} else { // 새로운 파일이 등록되지 않았다면
			// 기존 이미지를 그대로 사용
			vo.setRecipeImg(req.getParameter("recipeImg"));
			vo.setRecipeThumbImg(req.getParameter("recipeThumbImg"));

		}

		recipeService.recipeModify(vo);

		rttr.addAttribute("page", scri.getPage());
		rttr.addAttribute("perPageNum", scri.getPerPageNum());
		rttr.addAttribute("searchType", scri.getSearchType());
		rttr.addAttribute("keyword", scri.getKeyword());

		return "redirect:/recipe/admin_recipe_list";
	}

	@RequestMapping(value = "/recipe/delete")
	public String delete(@RequestParam("n") int recipeNum, @ModelAttribute("scri") SearchCriteria scri,
			RedirectAttributes rttr) throws Exception {

		recipeService.recipeDelete(recipeNum);

		rttr.addAttribute("page", scri.getPage());
		rttr.addAttribute("perPageNum", scri.getPerPageNum());
		rttr.addAttribute("searchType", scri.getSearchType());
		rttr.addAttribute("keyword", scri.getKeyword());
		return "redirect:/recipe/admin_recipe_list";
	}

	/* 판매 식재료 목록 페이지로 이동 */
	@RequestMapping("/recipe/sell_recipe_list")
	public String sellrecipeList(Model model, @ModelAttribute("scri") SearchCriteria scri) {
		List<RecipeVO> sellRecipeList = null;
		sellRecipeList = recipeService.sellRecipeList(scri);

		model.addAttribute("sellRecipeList", sellRecipeList);

		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(scri);
		pageMaker.setTotalCount(recipeService.listCount(scri));

		model.addAttribute("pageMaker", pageMaker);

		return "recipe/sell_recipe_list";
	}

	/* 판매 식재료 목록 카테고리별 이동 */
	@RequestMapping("/recipe/sellRecipeCateList")
	public String sellrecipeList(@RequestParam("c") String recipeCateCode, Model model,
			@ModelAttribute("scri") SearchCriteria scri) {
		List<RecipeVO> sellRecipeList = null;
		sellRecipeList = recipeService.sellRecipeCateList(recipeCateCode);

		model.addAttribute("sellRecipeList", sellRecipeList);

		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(scri);
		pageMaker.setTotalCount(recipeService.listCount(scri));

		model.addAttribute("pageMaker", pageMaker);
		return "recipe/sell_recipe_list";
	}

	// 식재료 내용
	@RequestMapping("/recipe/sellRecipeView")
	public String sellRecipeView(@RequestParam("n") int recipeNum, Model model, @ModelAttribute("scri") SearchCriteria scri) {
		RecipeVO sellRecipeView = recipeService.sellRecipeView(recipeNum);
		model.addAttribute("sellRecipeView", sellRecipeView);
		model.addAttribute("scri", scri);
		return "recipe/sell_recipe_view";
	}

	// 상품 소감(댓글) 작성
	@ResponseBody
	@RequestMapping(value = "/recipe/recipe_reply_write")
	public void writeReply(RecipeReplyVO replyVO, HttpSession session) throws Exception {

		MemberVO member = (MemberVO) session.getAttribute("member");
		replyVO.setUserId(member.getUserId());

		recipeService.registRecipeReply(replyVO);
	}

	// 상품 후기(댓글) 목록
	@ResponseBody
	@RequestMapping(value = "/recipe/recipe_reply_List")
	public List<RecipeReplyListVO> getReplyList(@RequestParam("n") int recipeNum) {

		List<RecipeReplyListVO> recipeReplyList = recipeService.recipeReplyList(recipeNum);

		return recipeReplyList;
	}

	// 상품 후기(댓글) 삭제
	@ResponseBody
	@RequestMapping(value = "/recipe/deleteRecipeReply")
	public int deleteReplyList(RecipeReplyVO replyVO, HttpSession session) {

		int result = 0;

		MemberVO member = (MemberVO) session.getAttribute("member");
		String userId = recipeService.idCheck(replyVO.getRepNum());

		if (member.getUserId().equals(userId)) {

			replyVO.setUserId(member.getUserId());
			recipeService.deleteRecipeReply(replyVO);

			result = 1;
		}

		return result;

	}

	// 상품 소감(댓글) 수정
	@ResponseBody
	@RequestMapping(value = "/recipe/modifyRecipeReply")
	public int updateReply(RecipeReplyVO replyVO, HttpSession session) {

		int result = 0;

		MemberVO member = (MemberVO) session.getAttribute("member");
		String userId = recipeService.idCheck(replyVO.getRepNum());

		if (member.getUserId().equals(userId)) {

			replyVO.setUserId(member.getUserId());
			recipeService.modifyRecipeReply(replyVO);
			result = 1;
		}

		return result;
	}
}
