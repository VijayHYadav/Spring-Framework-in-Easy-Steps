package com.bharath.spring.data.springdatajpa.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharath.spring.data.springdatajpa.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
