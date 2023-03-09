package com.dinislam.OnlineShopingSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinislam.OnlineShopingSystem.service.JoinTableService;

@RestController
@RequestMapping("/joinTable")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class JoinTableController {

	@Autowired
	JoinTableService joinTableService;
	
	@GetMapping("/getAll")
	public List<Object[]> getAllProductAndPurchaseAndVendor(){
		return joinTableService.getAllProductAndPurchaseAndVendor();
	}
	
	
}
