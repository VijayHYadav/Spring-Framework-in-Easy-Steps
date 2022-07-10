package com.bharath.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("setconfig.xml");
		CarDealer dealer = (CarDealer) ctx.getBean("cardealer");
		System.out.println(dealer.getName());
		System.out.println(dealer.getModels());
		System.out.println(dealer.getModels().getClass());
	}

}
