package spring.web.svc;

import java.util.List;

import spring.web.vo.RecipeReplyListVO;
import spring.web.vo.RecipeReplyVO;
import spring.web.vo.RecipeVO;
import spring.web.vo.SearchCriteria;

public interface RecipeService {
	public void recipeRegister(RecipeVO vo);
	public List<RecipeVO> recipeList(SearchCriteria scri);
	public int listCount(SearchCriteria scri);
	public RecipeVO recipeView(int recipeNum);
	public void recipeModify(RecipeVO vo);
	public void recipeDelete(int recipeNum);
	public List<RecipeVO> sellRecipeList(SearchCriteria scri);
	public List<RecipeVO> sellRecipeCateList(String recipeCateCode);
	public RecipeVO sellRecipeView(int recipeNum);
	public void registRecipeReply(RecipeReplyVO replyVO);
	public List<RecipeReplyListVO> recipeReplyList(int recipeNum);
	public void deleteRecipeReply(RecipeReplyVO replyVO);
	public String idCheck(int reqNum);
	public void modifyRecipeReply(RecipeReplyVO replyVO);
}