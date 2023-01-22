package com.dinislam.OnlineShopingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dinislam.OnlineShopingSystem.model.Category;



@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
