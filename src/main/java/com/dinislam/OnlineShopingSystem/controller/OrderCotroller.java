package com.dinislam.OnlineShopingSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.dinislam.OnlineShopingSystem.model.Orders;
import com.dinislam.OnlineShopingSystem.service.OrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class OrderCotroller {

	@Autowired
	OrderService orderService;
	
	@PostMapping("/post")
	public Orders post(@RequestBody Orders order) {
		return orderService.post(order);
	}
	
	@GetMapping("/getOrderList")
	public List<Orders> getOrderList(@RequestParam(value="userId") Long id) {
		return orderService.getOrderList(id);
	}
	
}
