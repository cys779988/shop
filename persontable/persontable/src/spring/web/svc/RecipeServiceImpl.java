package spring.web.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.web.dao.RecipeDAO;
import spring.web.vo.RecipeReplyListVO;
import spring.web.vo.RecipeReplyVO;
import spring.web.vo.RecipeVO;
import spring.web.vo.SearchCriteria;


@Service
public class RecipeServiceImpl implements RecipeService {
	
	@Autowired
	private RecipeDAO dao;
	
	@Override
	public void recipeRegister(RecipeVO vo) {
		// TODO Auto-generated method stub
		dao.recipeRegister(vo);
	}
	@Override
	public List<RecipeVO> recipeList(SearchCriteria scri) {
		// TODO Auto-generated method stub
		return dao.recipeList(scri);
	}
	@Override
	public int listCount(SearchCriteria scri) {
		// TODO Auto-generated method stub
		return dao.listCount(scri);
	}
	@Override
	public RecipeVO recipeView(int ingNum) {
		// TODO Auto-generated method stub
		return dao.recipeView(ingNum);
	}
	@Override
	public void recipeModify(RecipeVO vo) {
		// TODO Auto-generated method stub
		dao.recipeModify(vo);
	}
	@Override
	public void recipeDelete(int recipeNum) {
		// TODO Auto-generated method stub
		dao.recipeDelete(recipeNum);
	}
	
	@Override
	public List<RecipeVO> sellRecipeList(SearchCriteria scri) {
		// TODO Auto-generated method stub
		return dao.sellRecipeList(scri);
	}
	@Override
	public List<RecipeVO> sellRecipeCateList(String recipeCateCode) {
		// TODO Auto-generated method stub
		return dao.sellRecipeCateList(recipeCateCode);
	}
	@Override
	public RecipeVO sellRecipeView(int recipeNum) {
		// TODO Auto-generated method stub
		return dao.sellRecipeView(recipeNum);
	}
	@Override
	public void registRecipeReply(RecipeReplyVO replyVO) {
		// TODO Auto-generated method stub
		dao.registRecipeReply(replyVO);
	}
	@Override
	public List<RecipeReplyListVO> recipeReplyList(int recipeNum) {
		// TODO Auto-generated method stub
		return dao.recipeReplyList(recipeNum);
	}
	@Override
	public void deleteRecipeReply(RecipeReplyVO replyVO) {
		// TODO Auto-generated method stub
		dao.deleteRecipeReply(replyVO);
	}
	@Override
	public String idCheck(int reqNum) {
		// TODO Auto-generated method stub
		return dao.idCheck(reqNum);
	}
	@Override
	public void modifyRecipeReply(RecipeReplyVO replyVO) {
		// TODO Auto-generated method stub
		dao.modifyRecipeReply(replyVO);
	}
	
}
