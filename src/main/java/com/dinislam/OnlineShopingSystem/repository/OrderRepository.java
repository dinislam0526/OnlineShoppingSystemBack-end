package com.dinislam.OnlineShopingSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.dinislam.OnlineShopingSystem.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long>{

	
	@Query(value = "SELECT * FROM orders where user_id =? ", nativeQuery = true)
    List<Orders> getOrderList(Long userId);
	
	@Modifying
	@Query(value ="update orders u set u.status = :status where u.order_id = :id", nativeQuery = true)
    void getOrderList1(@Param("id") Long id,@Param("status") String status);

//	void getOrderList1(Long userId, String status);
	
}
