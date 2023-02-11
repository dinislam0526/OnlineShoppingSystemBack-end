package com.dinislam.OnlineShopingSystem.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dinislam.OnlineShopingSystem.model.SignUp;
import com.dinislam.OnlineShopingSystem.repository.SignUpRepository;

@Service
public class SignUpService {

	@Autowired
	SignUpRepository signUpRepository;
	
	public SignUp post(SignUp signUp) {
		if(!signUp.equals(null)) {
			
			return signUpRepository.save(signUp);
		}
		return null;
	}
	
	public SignUp getUser(String username ,String password) {
		return signUpRepository.getUser(username,password);
	}
	
}
