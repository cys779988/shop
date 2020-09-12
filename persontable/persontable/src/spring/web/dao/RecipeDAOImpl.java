package spring.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.web.vo.RecipeReplyListVO;
import spring.web.vo.RecipeReplyVO;
import spring.web.vo.RecipeVO;
import spring.web.vo.SearchCriteria;

@Repository
public class RecipeDAOImpl implements RecipeDAO{
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void recipeRegister(RecipeVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert("recipeMapper.recipeRegister", vo);
	}

	@Override
	public List<RecipeVO> recipeList(SearchCriteria scri) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("recipeMapper.recipeList",scri);
	}

	@Override
	public int listCount(SearchCriteria scri) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("recipeMapper.listCount",scri);
	}

	@Override
	public RecipeVO recipeView(int recipeNum) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("recipeMapper.recipeView", recipeNum);
	}

	@Override
	public void recipeModify(RecipeVO vo) {
		// TODO Auto-generated method stub
		sqlSession.update("recipeMapper.recipeModify", vo);
	}

	@Override
	public void recipeDelete(int recipeNum) {
		// TODO Auto-generated method stub
		sqlSession.delete("recipeMapper.recipeDelete", recipeNum);
	}

	@Override
	public List<RecipeVO> sellRecipeList(SearchCriteria scri) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("recipeMapper.sellRecipeList",scri);
	}
	@Override
	public List<RecipeVO> sellRecipeCateList(String recipeCateCode) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("recipeMapper.sellRecipeCateList", recipeCateCode);
	}
	@Override
	public RecipeVO sellRecipeView(int recipeNum) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("recipeMapper.sellRecipeView", recipeNum);
	}
	@Override
	public void registRecipeReply(RecipeReplyVO replyVO) {
		// TODO Auto-generated method stub
		sqlSession.insert("recipeMapper.registRecipeReply", replyVO);
	}
	@Override
	public List<RecipeReplyListVO> recipeReplyList(int recipeNum) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("recipeMapper.recipeReplyList", recipeNum);
	}
	@Override
	public void deleteRecipeReply(RecipeReplyVO replyVO) {
		// TODO Auto-generated method stub
		sqlSession.delete("recipeMapper.deleteRecipeReply", replyVO);
	}
	@Override
	public String idCheck(int reqNum) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("recipeMapper.replyUserIdCheck", reqNum);
	}
	@Override
	public void modifyRecipeReply(RecipeReplyVO replyVO) {
		// TODO Auto-generated method stub
		sqlSession.update("recipeMapper.modifyRecipeReply", replyVO);
	}
}
