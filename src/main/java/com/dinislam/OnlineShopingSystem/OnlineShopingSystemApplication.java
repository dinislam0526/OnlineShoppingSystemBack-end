package com.dinislam.OnlineShopingSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.dinislam.OnlineShopingSystem")
public class OnlineShopingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopingSystemApplication.class, args);
	}

}
