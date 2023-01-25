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
import org.springframework.web.bind.annotation.RestController;
import com.dinislam.OnlineShopingSystem.model.Category;
import com.dinislam.OnlineShopingSystem.service.CategoryService;



@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CategoryController {

	@Autowired
	 CategoryService categoryService;

	@PostMapping("/post")
	public Category post(@RequestBody Category model) {
		
		return categoryService.post(model);
	}
	
	
	@GetMapping("/get/{id}")
	public Category get(@PathVariable Long id) {
		
		return categoryService.getById(id);
	}
	
	@PutMapping("/update")
	public Category update(@RequestBody Category model) {
		
		return categoryService.update(model);
	}
	

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		
		return categoryService.delete(id);
	}
	
	@GetMapping("/getAll")
	public List<Category> getAll() {
		
		return categoryService.modelList();
	}
	
	@PostMapping("/postAll")
	public List<Category> postAll(@RequestBody List<Category> modelList) {
		
		return categoryService.postAll(modelList);
	}
	
	@GetMapping("/catnamelist")
    public List<Category> getAllPcategoryName(){
		System.out.print("hit controller");
        return categoryService.viewAllPcategoryName();
    }
}
