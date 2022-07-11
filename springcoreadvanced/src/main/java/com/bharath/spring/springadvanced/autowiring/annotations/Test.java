package com.bharath.spring.springadvanced.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configannotations.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);
    }
}
