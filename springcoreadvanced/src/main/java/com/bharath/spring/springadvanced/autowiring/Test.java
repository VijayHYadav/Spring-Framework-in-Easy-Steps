package com.bharath.spring.springadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);
    }
}
