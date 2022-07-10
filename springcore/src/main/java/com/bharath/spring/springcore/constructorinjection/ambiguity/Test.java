package com.bharath.spring.springcore.constructorinjection.ambiguity;

import com.bharath.spring.springcore.constructorinjection.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjectionambiguity.xml");
        Addition addition = (Addition) context.getBean("addition");
        System.out.println(addition);
    }
}
