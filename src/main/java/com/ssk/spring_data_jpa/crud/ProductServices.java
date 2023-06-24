package com.ssk.spring_data_jpa.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {

	@Autowired
	private ProductRepository productRepository;

	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(int product_id) {
		return productRepository.findById(product_id).get();
	}

	public Product updateProduct(int product_id, Product product) {
		return productRepository.save(product);
	}

	public void deleteProductById(int product_id) {
		productRepository.deleteById(product_id);
	}

}
