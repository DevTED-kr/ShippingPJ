package com.nouvolution.shipn41.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nouvolution.shipn41.dao.ArticleDAO;
import com.nouvolution.shipn41.dto.ArticleVO;

@Service
public class ArticleServiceImpl implements ArticleService {

	private final ArticleDAO articleDAO;
	
	public ArticleServiceImpl(ArticleDAO articleDAO) {
		// TODO Auto-generated constructor stub
		this.articleDAO = articleDAO;
	}

	@Override
	public ArticleVO read(Integer articleNO) throws Exception {
		// TODO Auto-generated method stub
		return articleDAO.read(articleNO);
	}

	@Override
	public List<ArticleVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return articleDAO.listAll();
	}

}
