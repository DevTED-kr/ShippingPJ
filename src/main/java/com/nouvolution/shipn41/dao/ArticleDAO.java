package com.nouvolution.shipn41.dao;

import java.util.List;

import com.nouvolution.shipn41.dto.ArticleVO;

public interface ArticleDAO {
	
	ArticleVO read(Integer articleNO) throws Exception;
	
	List<ArticleVO> listAll() throws Exception;
	
}
