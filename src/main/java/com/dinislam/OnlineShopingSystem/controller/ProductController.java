package com.dinislam.OnlineShopingSystem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dinislam.OnlineShopingSystem.model.Product;
import com.dinislam.OnlineShopingSystem.service.ProductService;



@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class ProductController {
	@Autowired
	ProductService productService;

	@PostMapping("/post")
	public Product post(@RequestBody Product product) {
		return productService.post(product);
	}
	
	
	@GetMapping("/getById/{id}")
	public Product getById(@PathVariable Integer id) {
		return productService.getById(id);
	}
	
	@PutMapping("/update")
	public Product update(@RequestBody Product product) {
		return productService.update(product);
	}
	

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return productService.delete(id);
	}
	
	@GetMapping("/getAll")
	public List<Product> getAll() {
		return productService.modelList();
	}
	
	@PostMapping("/postAll")
	public List<Product> postAll(@RequestBody List<Product> modelList) {
		return productService.postAll(modelList);
	}
	
	@GetMapping("/getCategoryWiseProduct")
	public List<Product> getCategoryWiseProduct(@RequestParam(value="catName") String catName) {
		return productService.getCategoryWiseProduct(catName);
	}
	
	
}
