//package com.dinislam.OnlineShopingSystem.controller;
//
////import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.http.HttpStatus;
////import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
////import org.springframework.web.bind.annotation.DeleteMapping;
////import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
////import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.dinislam.OnlineShopingSystem.model.Product;
//import com.dinislam.OnlineShopingSystem.service.ProductService;
//
//
//@RestController
//@RequestMapping("/product")
//@CrossOrigin("*")
//public class ProductController {
//	
//	 @Autowired
//	    private ProductService productService;
//	    
////	    @GetMapping("/product")
////	    public List<Product> getAllProduct(){
////	        return productService.viewAllProduct();
////	    }
////	    
////	    @GetMapping("/product/pnamelist")
////	    public List<Product> getAllProductName(){
////	        return productService.viewAllProductName();
////	    }
////	    
////	    @GetMapping("/product/{prid}")
////	    public ResponseEntity<Product> getOneProduct(@PathVariable("prid") int prid){
////	        Product product = productService.viewOneProduct(prid);
////	        if (product == null){
////	            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
////	        }
////	        return new ResponseEntity<Product>(product, HttpStatus.OK);
////	    }
////	    
////	    @GetMapping("/product/pro/{pname}")
////	    public ResponseEntity<Product> getProductByName(@PathVariable("pname") String pname){
////	        Product product = productService.viewProductByName(pname);
////	        if (product == null){
////	            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
////	        }
////	        return new ResponseEntity<Product>(product, HttpStatus.OK);
////	    }
////	    
////	    @GetMapping("/product/id/{pname}")
////	    public ResponseEntity<Integer> getProductIdByName(@PathVariable("pname") String pname){
////	        Product product = productService.viewProductByName(pname);
////	        if (product == null){
////	            return new ResponseEntity<Integer>(HttpStatus.NOT_FOUND);
////	        }
////	        return new ResponseEntity<Integer>(product.getPro_id(), HttpStatus.OK);
////	    }
////	    
////	    @GetMapping("/product/name/{prid}")
////	    public ResponseEntity<String> getOneProductNameById(@PathVariable("prid") int prid){
////	        Product product = productService.viewOneProduct(prid);
////	        if (product == null){
////	            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
////	        }
////	        return new ResponseEntity<String>(product.getPro_name(), HttpStatus.OK);
////	    }
//	    
//	    @PostMapping("/post")
//	    public Product createProduct(@RequestBody Product product){
//	        return productService.insertProduct(product);
//	    }
//	    
////	    @PutMapping("/product/{prid}")
////	    public ResponseEntity<Product> updateProduct(@PathVariable("prid") int prid, @RequestBody Product product){
////	        
////	        Product currentproduct = productService.viewOneProduct(prid);
////	        
////	        if (currentproduct == null){
////	            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
////	        }
////	        
////	        currentproduct.setPro_id(product.getPro_id());
////	        currentproduct.setCatid(product.getCatid());
////	        currentproduct.setPro_name(product.getPro_name());
////	        currentproduct.setPro_desc(product.getPro_desc());
////	        currentproduct.setPro_image(product.getPro_image());
////	        currentproduct.setPro_price(product.getPro_price());
////	        currentproduct.setPro_cat(product.getPro_cat());
////	        
////	        
////	        productService.updateProduct(currentproduct);
////	        
////	        return new ResponseEntity<Product>(currentproduct, HttpStatus.OK);
////	    }
////	    
////	    @DeleteMapping("/product/{prid}")
////	    public ResponseEntity<Product> deleteProduct(@PathVariable("prid") int prid){
////	        Product product = productService.viewOneProduct(prid);
////	        if (product == null){
////	            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
////	        }
////	        productService.deleteProduct(prid);
////	        return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
////	    }
//
//}
