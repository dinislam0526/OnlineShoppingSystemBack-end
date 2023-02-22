package com.dinislam.OnlineShopingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinislam.OnlineShopingSystem.model.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long>{

	
}
