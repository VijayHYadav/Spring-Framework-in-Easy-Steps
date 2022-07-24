package com.bharath.spring.data.springdatajpa.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.spring.data.springdatajpa.data.entities.Product;
import com.bharath.spring.data.springdatajpa.repos.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductControllers {

	@Autowired
	ProductRepository repository;

	/**
	 * You can convert it into a list, etc if you want to. But I am returning an
	 * Iterable. Spring will automatically convert this into JSON. That magic
	 * happens for us automatically. So the default data format for spring RESTful
	 * web services is JSON, it configures the Jackson adapters and all that
	 * automatically.
	 */
	@GetMapping
	public Iterable<Product> getProducts() {
		return repository.findAll();
	}

	@PostMapping
	public Product create(@RequestBody Product product) {
		return repository.save(product);
	}
	
	/**
	 * repository.save. This save method internally, 
	 * it knows whether a particular product is already there.
	 * If it's there it will update that information instead of creating it by looking at the ID field in the
	 * request and it returns that product back. Stop */
	@PutMapping
	public Product update(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@GetMapping("/{id}")
	public Optional<Product> getProduct(@PathVariable("id") Long id) {
		return repository.findById(id);
	}
}
