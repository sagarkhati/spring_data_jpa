package com.ssk.spring_data_jpa;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ssk.spring_data_jpa.crud.Product;
import com.ssk.spring_data_jpa.crud.ProductRepository;

@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest
class SpringDataJpaApplicationTests {

	@Autowired
	ProductRepository productRepo;

	@Test
	@Order(1)
	void contextLoads() {
	}

	@Test
	@Order(2)
	void testCreate() {
		Product product = new Product();
		product.setId(1);
		product.setName("Pen");
		product.setDesc("A pen");
		product.setPrice(10.00);

		System.out.println("Product Saved: " + productRepo.save(product));
	}

	@Test
	@Order(3)
	void testReadAll() {
		List<Product> product = productRepo.findAll();

		System.out.println("Products Recieved: " + product);
	}

	@Test
	@Order(4)
	void testReadById() {
		Product product = productRepo.findById(1).get();
		assertNotNull(product);
		assertEquals("Pen", product.getName());

		System.out.println("Product Recieved: " + product);
	}

	@Test
	@Order(5)
	void testUpdate() {
		Product product = productRepo.findById(1).get();
		product.setPrice(5.00);

		System.out.println("Product Updated: " + productRepo.save(product));
	}

	@Test
	@Order(6)
	void testDeleteById() {
		productRepo.deleteById(1);

		Optional<Product> product = productRepo.findById(1);
		assertTrue(product.isEmpty());
		assertFalse(product.isPresent());
	}

}
