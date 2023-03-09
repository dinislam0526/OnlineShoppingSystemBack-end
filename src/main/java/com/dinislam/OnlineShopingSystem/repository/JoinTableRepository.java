package com.dinislam.OnlineShopingSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dinislam.OnlineShopingSystem.model.JoinTable;



@Repository
public interface JoinTableRepository extends JpaRepository<JoinTable, Long>{

	@Query(value = "select pd.purchase_id,qty,date,total,price, p.pro_name,pro_price, v.vendor_name from purchase_details pd, product p, vendor v where pd.pro_id=p.pro_id and pd.vendor_id=v.vendor_id", nativeQuery = true)
    List<Object[]> getAllProductAndPurchaseAndVendor();
	
}
