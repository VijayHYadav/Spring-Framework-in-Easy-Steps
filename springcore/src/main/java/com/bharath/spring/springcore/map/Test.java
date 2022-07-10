package com.bharath.spring.springcore.map;

import com.bharath.spring.springcore.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("mapconfig.xml");
		Customer customer = (Customer) ctx.getBean("customer");
		System.out.println(customer.getId());
		System.out.println(customer.getProducts());
		System.out.println(customer);
	}

}
