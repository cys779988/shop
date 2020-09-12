package spring.web.dao;

import java.util.List;

import spring.web.vo.RecipeReplyListVO;
import spring.web.vo.RecipeReplyVO;
import spring.web.vo.RecipeVO;
import spring.web.vo.SearchCriteria;

public interface RecipeDAO {
	//상품 등록
		public void recipeRegister(RecipeVO vo);
		//상품 목록
		public List<RecipeVO> recipeList(SearchCriteria scri);
		//상품 검색
		public int listCount(SearchCriteria scri);
		//상품 조회 + 카테고리 조회
		public RecipeVO recipeView(int recipeNum);
		//상품 수정
		public void recipeModify(RecipeVO vo);
		//상품 삭제
		public void recipeDelete(int recipeNum);
		//판매 상품 목록
		public List<RecipeVO> sellRecipeList(SearchCriteria scri);
		//판매 상품 카테고리 목록
		public List<RecipeVO> sellRecipeCateList(String recipeCateCode);
		//핀매 상품 조회
		public RecipeVO sellRecipeView(int recipeNum);
		//판매 상품 댓글 작성
		public void registRecipeReply(RecipeReplyVO replyVO);
		//판매 상품 댓글 목록
		public List<RecipeReplyListVO> recipeReplyList(int recipeNum);
		//판매 상품 댓들 삭제
		public void deleteRecipeReply(RecipeReplyVO replyVO);
		// 아이디 체크
		public String idCheck(int reqNum);
		//판매 상품 댓들 수정
		public void modifyRecipeReply(RecipeReplyVO replyVO);
}