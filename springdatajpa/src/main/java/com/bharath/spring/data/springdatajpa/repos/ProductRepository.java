package com.bharath.spring.data.springdatajpa.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bharath.spring.data.springdatajpa.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	List<Product> findByName(String name);
	List<Product> findByPrice(Double name);
}
