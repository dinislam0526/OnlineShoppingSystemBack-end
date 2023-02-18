package com.dinislam.OnlineShopingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinislam.OnlineShopingSystem.model.Coupon;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long>{

}
