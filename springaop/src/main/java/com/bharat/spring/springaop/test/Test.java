package com.bharat.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bharat.spring.springaop.ProductService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ProductService productService = (ProductService) context.getBean("productService");
		System.out.println(productService.multiply(2, 5));
	}

}
