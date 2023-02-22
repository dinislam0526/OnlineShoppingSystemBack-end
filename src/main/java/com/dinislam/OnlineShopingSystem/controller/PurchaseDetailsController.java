package com.dinislam.OnlineShopingSystem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinislam.OnlineShopingSystem.model.PurchaseDetails;
import com.dinislam.OnlineShopingSystem.service.PurchaseDetailsService;

@RestController
@RequestMapping("/purchase")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class PurchaseDetailsController {

	@Autowired
	PurchaseDetailsService purchaseDetailsService;

	@PostMapping("/post")
	public PurchaseDetails post(@RequestBody PurchaseDetails purchaseDetails) {
		
		return purchaseDetailsService.post(purchaseDetails);
	}
	
	
	@GetMapping("/get/{id}")
	public PurchaseDetails get(@PathVariable Long id) {
		
		return purchaseDetailsService.getById(id);
	}
	
	@PutMapping("/update")
	public PurchaseDetails update(@RequestBody PurchaseDetails purchaseDetails) {
		
		return purchaseDetailsService.update(purchaseDetails);
	}
	

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		
		return purchaseDetailsService.delete(id);
	}
	
	
	
}
