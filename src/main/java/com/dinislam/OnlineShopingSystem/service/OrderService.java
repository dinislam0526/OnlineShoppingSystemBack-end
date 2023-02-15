package com.dinislam.OnlineShopingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinislam.OnlineShopingSystem.model.Cart;
import com.dinislam.OnlineShopingSystem.model.Orders;
import com.dinislam.OnlineShopingSystem.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	
	  public Orders post(Orders order) {
			
			if(!order.equals(null)) {
				return orderRepository.save(order);
			}
			return null;
		}
	  
	  public List<Orders> getOrderList(Long userId) {
			return orderRepository.getOrderList(userId);
		}
	  
	  
	  public void getOrderList1(long userId, String status) {
//			orderRepository.getOrderList1(userId, status);
		  orderRepository.getOrderList1(userId, status);
		}
	
}
