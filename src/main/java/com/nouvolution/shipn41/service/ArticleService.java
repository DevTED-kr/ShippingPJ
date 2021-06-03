package com.nouvolution.shipn41.service;

import java.util.List;

import com.nouvolution.shipn41.dto.ArticleVO;

public interface ArticleService {

	ArticleVO read(Integer articleNO) throws Exception;
	
	List<ArticleVO> listAll() throws Exception;
	
}
