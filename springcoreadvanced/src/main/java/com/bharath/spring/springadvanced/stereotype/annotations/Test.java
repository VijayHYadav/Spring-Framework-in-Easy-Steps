package com.bharath.spring.springadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeannotations.xml");
        Instructor instructor = (Instructor) context.getBean("instructor");
        System.out.println(instructor);
    }
}
