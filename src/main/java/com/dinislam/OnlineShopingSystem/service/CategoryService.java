package com.dinislam.OnlineShopingSystem.service;

import java.util.List;
import java.util.Optional;

import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dinislam.OnlineShopingSystem.model.Category;
import com.dinislam.OnlineShopingSystem.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public Category post(Category category) {
		
		if(!category.equals(null)) {
			
			return categoryRepository.save(category);
		}
		return null;
	}
	
	public Category getById(Long id) {
		Optional<Category> optional = categoryRepository.findById(id);
		if(optional.isPresent()) {
			
			return optional.get();
		}
		
		return null;
	}
	
	public Category update(Category category) {
		
//		Optional<Model> optional = repository.findById(model.getId());
//		if(optional.isPresent()) {
//			return optional.get();
//		}
//		
		return categoryRepository.save(category);
	}
		
	public String delete(Long id) {
		Optional<Category> optional = categoryRepository.findById(id);
		if(optional.isPresent()) {
			
			categoryRepository.delete(optional.get());
			 return "success";
		}
		return "fail";
	}
	
	public List<Category> modelList() {
			
			return categoryRepository.findAll();
		}
	
	
	public List<Category> postAll(List<Category> modelList) {
		
		return categoryRepository.saveAll(modelList);
	}
	
	@Autowired
    SessionFactory sessionFactory;
	
	public List<Category> viewAllPcategoryName() {
        Session session = (Session) sessionFactory.getCurrentSession();

        @SuppressWarnings("unchecked")
		List<Category> pcatlist = ((org.hibernate.Session) session).createQuery("select p from Category p").list();
        
        return pcatlist;
    }
}
