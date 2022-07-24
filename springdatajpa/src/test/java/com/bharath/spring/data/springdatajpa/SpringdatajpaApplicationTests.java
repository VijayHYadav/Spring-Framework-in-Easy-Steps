package com.bharath.spring.data.springdatajpa;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.bharath.spring.data.springdatajpa.data.entities.Product;
import com.bharath.spring.data.springdatajpa.repos.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	public void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);

//		Product product = new Product();
//		product.setId(10L);
//		product.setName("keyboard");
//		product.setDescription("this is world class keyboard.");
//		product.setPrice(1000d);
//		repository.save(product);

//		Optional<Product> findById = repository.findById(10L);
//		if (findById.isPresent()) {
//			Product product = findById.get();
//			product.setPrice(200d);
//			repository.save(product);
//			
//			repository.findAll().forEach(p ->{System.out.println(p.getPrice());});
//		}
		
		System.out.println(repository.findByName("moto"));
		System.out.println(repository.findByPrice(700d));
		
	}

}
