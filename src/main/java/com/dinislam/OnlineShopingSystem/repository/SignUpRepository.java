package com.dinislam.OnlineShopingSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dinislam.OnlineShopingSystem.model.SignUp;

@Repository
public interface SignUpRepository extends JpaRepository<SignUp,Long>{
	
	@Query(value = "SELECT * FROM sign_up where username =?,password=? ", nativeQuery = true)
    List<SignUp> getUser(String usrname,String password);

}
