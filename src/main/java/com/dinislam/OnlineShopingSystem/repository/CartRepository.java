package com.dinislam.OnlineShopingSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dinislam.OnlineShopingSystem.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart ,Long>{

	@Query(value = "SELECT * FROM cart where user_id =? ", nativeQuery = true)
    List<Cart> getCartList(Long userId);
}
