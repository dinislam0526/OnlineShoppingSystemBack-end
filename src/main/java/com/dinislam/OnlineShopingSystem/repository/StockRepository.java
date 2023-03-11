package com.dinislam.OnlineShopingSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dinislam.OnlineShopingSystem.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long>{

	@Query(value ="select s.stock_id,qty , p.pro_name,pro_price from stock s,product p where s.pro_id=p.pro_id",nativeQuery = true)
	List<Object[]> getAllStock();
}
