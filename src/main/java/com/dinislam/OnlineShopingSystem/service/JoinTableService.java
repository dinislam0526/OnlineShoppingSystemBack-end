package com.dinislam.OnlineShopingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinislam.OnlineShopingSystem.repository.JoinTableRepository;

@Service
public class JoinTableService {

	@Autowired
	JoinTableRepository joinTableRepository;
	
	public List<Object[]> getAllProductAndPurchaseAndVendor(){
		return joinTableRepository.getAllProductAndPurchaseAndVendor();
	}
}
