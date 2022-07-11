package com.bharath.spring.springadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollections.xml");
        ProductsList productsList = (ProductsList) context.getBean("productsList");
        System.out.println(productsList);
    }
}
