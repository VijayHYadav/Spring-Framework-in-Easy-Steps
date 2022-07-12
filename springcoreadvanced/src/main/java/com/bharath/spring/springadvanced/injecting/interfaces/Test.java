package com.bharath.spring.springadvanced.injecting.interfaces;

import com.bharath.spring.springadvanced.stereotype.annotations.Instructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("injectioninterface.xml");
        OrderBO orderBO = (OrderBO) context.getBean("bao");
        orderBO.placeOrder();
    }
}
