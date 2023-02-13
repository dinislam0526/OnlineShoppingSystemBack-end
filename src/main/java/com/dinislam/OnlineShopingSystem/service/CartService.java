package com.dinislam.OnlineShopingSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinislam.OnlineShopingSystem.model.Cart;
import com.dinislam.OnlineShopingSystem.model.Product;
import com.dinislam.OnlineShopingSystem.repository.CartRepository;

@Service
public class CartService {

	@Autowired
	CartRepository cartRepository;
	
  public Cart post(Cart cart) {
		
		if(!cart.equals(null)) {
			
			return cartRepository.save(cart);
		}
		return null;
	}
  
  public List<Cart> getCartList(Long userId) {
		return cartRepository.getCartList(userId);
	}
  
  public String removeToCart(Long id){
	  Optional<Cart> optional = cartRepository.findById(id);
	  if(optional.isPresent()) {
		  cartRepository.delete(optional.get());
		  return null;
	  }
	  return "fail";
  }
  
  
}
