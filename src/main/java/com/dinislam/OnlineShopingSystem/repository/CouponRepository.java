package com.dinislam.OnlineShopingSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dinislam.OnlineShopingSystem.model.Coupon;
import com.dinislam.OnlineShopingSystem.model.Product;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long>{

	
	
	@Query(value = "SELECT * FROM coupon where coupon_code =? limit 1", nativeQuery = true)
    Coupon getByCouponCode(String couponCode);
	
}
