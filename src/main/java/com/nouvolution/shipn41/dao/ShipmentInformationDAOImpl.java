package com.nouvolution.shipn41.dao;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


@Repository
public class ShipmentInformationDAOImpl implements ShipmentInformationDAO {
	private static final String NAMESPACEUSER = "com.nouvolution.shipn41.mappers.user.UserMapper";
	private static final String NAMESPACESHIP = "com.nouvolution.shipn41.mappers.shipment_information.shipInfoMapper";
	private static final Logger logger = LoggerFactory.getLogger(ShipmentInformationDAOImpl.class);
	
	private final SqlSession sqlSession;
	
	@Inject
	public ShipmentInformationDAOImpl(SqlSession sqlSession) {
		// TODO Auto-generated constructor stub
		this.sqlSession = sqlSession;
	}
	
	@Override
	public  Map<String, Object> getShipmentInforIdByUserId(String userId) {
		logger.info("inn getShipmentInforIdByUserId REPOSITORY");
		// TODO Auto-generated method stub
		int shipmentInfoId = sqlSession.selectOne(NAMESPACEUSER + ".findUserKeyByUserId", userId);
		logger.info(shipmentInfoId+"");
		
		 return sqlSession.selectOne(NAMESPACESHIP + ".findUserKeyByUserId",shipmentInfoId);
	}

}
