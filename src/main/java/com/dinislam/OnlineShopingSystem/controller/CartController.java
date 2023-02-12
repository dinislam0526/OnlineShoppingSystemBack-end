package com.dinislam.OnlineShopingSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dinislam.OnlineShopingSystem.model.Cart;

import com.dinislam.OnlineShopingSystem.service.CartService;


@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CartController {

	@Autowired
	CartService cartService;

	@PostMapping("/post")
	public Cart post(@RequestBody Cart cart) {
		return cartService.post(cart);
	}
	
	@GetMapping("/getCartList")
	public List<Cart> getCartList(@RequestParam(value="userId") Long id) {
		return cartService.getCartList(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String removeToCart(@PathVariable Long id){
		return cartService.removeToCart(id);
	}
	
	
}
