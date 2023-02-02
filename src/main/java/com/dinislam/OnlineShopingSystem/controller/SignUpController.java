package com.dinislam.OnlineShopingSystem.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinislam.OnlineShopingSystem.model.SignUp;
import com.dinislam.OnlineShopingSystem.service.SignUpService;

@RestController
@RequestMapping("/signUp")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class SignUpController {

	@Autowired
	SignUpService signUpServece;
	
	@PostMapping("/post")
	public SignUp post(SignUp signUp) {
		
		return signUpServece.post(signUp);
	}
}
