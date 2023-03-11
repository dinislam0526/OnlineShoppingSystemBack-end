package com.dinislam.OnlineShopingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinislam.OnlineShopingSystem.model.Stock;
import com.dinislam.OnlineShopingSystem.repository.StockRepository;

@Service
public class StockService {

	@Autowired
	StockRepository stockReopsitory;
	
	
	public List<Object[]> getAllStock(){
		return stockReopsitory.getAllStock();
	}
	
}
