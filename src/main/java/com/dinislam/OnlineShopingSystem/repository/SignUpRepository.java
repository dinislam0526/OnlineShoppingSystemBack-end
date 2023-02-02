package com.dinislam.OnlineShopingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinislam.OnlineShopingSystem.model.SignUp;

@Repository
public interface SignUpRepository extends JpaRepository<SignUp,Long>{

}
