package com.nouvolution.shipn41.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nouvolution.shipn41.dao.ShipmentInformationDAO;

@Service
public class ShipmentInfoServiceImpl implements ShipmentInfoSerivce {

	@Autowired
	ShipmentInformationDAO shipmentInformationDAO;
	
	public ShipmentInfoServiceImpl(ShipmentInformationDAO shipmentInformationDAO) {
		// TODO Auto-generated constructor stub
		this.shipmentInformationDAO = shipmentInformationDAO;
	}
	
	@Override
	public Map<String, Object> getShipmentInforIdByUserId(String userid) {
		// TODO Auto-generated method stub-
		return shipmentInformationDAO.getShipmentInforIdByUserId(userid);
	}

}
