package com.bharath.spring.springcore.properties;

import com.bharath.spring.springcore.map.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("propertiesconfig.xml");
		CountriesAndLanguages countriesandlangs = (CountriesAndLanguages) ctx.getBean("countriesandlangs");
		System.out.println(countriesandlangs);
	}

}
