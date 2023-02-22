package com.dinislam.OnlineShopingSystem.controller;

import java.util.List;

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

import com.dinislam.OnlineShopingSystem.model.Vendor;
import com.dinislam.OnlineShopingSystem.service.VendorService;

@RestController
@RequestMapping("/vendor")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class VendorCotroller {

	@Autowired
	VendorService vendorService;

	@PostMapping("/post")
	public Vendor post(@RequestBody Vendor vendor) {
		
		return vendorService.post(vendor);
	}
	
	
	@GetMapping("/get/{id}")
	public Vendor get(@PathVariable Long id) {
		
		return vendorService.getById(id);
	}
	
	@PutMapping("/update")
	public Vendor update(@RequestBody Vendor vendor) {
		
		return vendorService.update(vendor);
	}
	

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		
		return vendorService.delete(id);
	}
	
	@GetMapping("/getAll")
	public List<Vendor> getAll() {
		return vendorService.getAllCategory();
	}
	
	
	
}
