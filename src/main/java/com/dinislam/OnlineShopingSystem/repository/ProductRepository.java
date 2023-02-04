package com.dinislam.OnlineShopingSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.dinislam.OnlineShopingSystem.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query(value = "SELECT * FROM product where pro_cat =? ", nativeQuery = true)
    List<Product> getCategoryWiseProduct(String catname);
}
