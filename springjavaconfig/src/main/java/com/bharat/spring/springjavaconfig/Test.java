package com.bharat.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//		context.register(null);
		Dao dao = context.getBean(Dao.class);
		dao.create();
	}
}
