package com.dinislam.OnlineShopingSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.dinislam.OnlineShopingSystem.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long>{

	
	@Query(value = "SELECT * FROM orders where user_id =? ", nativeQuery = true)
    List<Orders> getOrderList(Long userId);
	
}
