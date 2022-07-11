package com.bharath.spring.springcore.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("propertiesplaceholder.xml");
        MyDAO mydao = (MyDAO) ctx.getBean("myDAO");
        System.out.println(mydao);
    }
}
