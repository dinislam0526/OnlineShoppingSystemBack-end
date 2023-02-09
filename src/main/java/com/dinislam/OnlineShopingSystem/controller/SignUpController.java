package com.dinislam.OnlineShopingSystem.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public SignUp post(@RequestBody SignUp signUp) {
		
		return signUpServece.post(signUp);
	}
	
	@GetMapping("/getUser")
	public SignUp getUser(@RequestParam(value="username") String username ,@RequestParam(value="password") String password) {
		return signUpServece.getUser(username, password);
	}
}
