package com.nouvolution.shipn41.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nouvolution.shipn41.dto.ArticleVO;

@Repository
public class ArticleDAOImpl implements ArticleDAO {

	private static final String NAMESPACE = "com.nouvolution.shipn41.mappers.Information_SO.soInformationMapper";
	
	private final SqlSession sqlSession;
	
	@Inject
	public ArticleDAOImpl(SqlSession sqlSession) {
		// TODO Auto-generated constructor stub
		this.sqlSession = sqlSession;
	}
	
	@Override
	public ArticleVO read(Integer articleNO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE + ".readcheck", articleNO);
	}

	@Override
	public List<ArticleVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE + ".listAll");
	}

}
