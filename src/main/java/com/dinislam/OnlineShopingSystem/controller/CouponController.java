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

import com.dinislam.OnlineShopingSystem.model.Coupon;
import com.dinislam.OnlineShopingSystem.service.CouponService;

@RestController
@RequestMapping("/coupon")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CouponController {

	@Autowired
	 CouponService couponService;

	@PostMapping("/post")
	public Coupon post(@RequestBody Coupon coupon) {
		return couponService.post(coupon);
	}
	
	@PutMapping("/update")
	public Coupon update(@RequestBody Coupon coupon) {
		return couponService.update(coupon);
	}
	

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		return couponService.delete(id);
	}
	
	@GetMapping("/getAll")
	public List<Coupon> getAll() {
		return couponService.getAllCoupon();
	}
	
	
	
	
	
}
