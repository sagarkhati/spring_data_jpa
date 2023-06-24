package com.ssk.spring_data_jpa.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductServices productServices;

	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product) {
		return productServices.createProduct(product);
	}

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productServices.getAllProducts();
	}

	@GetMapping("/products/{product_id}")
	public Product getProductById(@PathVariable int product_id) {
		return productServices.getProductById(product_id);
	}
	
	@PutMapping("/products/{product_id}")
	public Product updateProduct(@PathVariable int product_id, @RequestBody Product product) {
		return productServices.updateProduct(product_id, product);
	}
	
	@DeleteMapping("/products/{product_id}")
	public void deleteProductById(@PathVariable int product_id) {
		productServices.deleteProductById(product_id);
	}
	
}
