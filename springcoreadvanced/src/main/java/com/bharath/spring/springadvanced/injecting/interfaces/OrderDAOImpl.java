package com.bharath.spring.springadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO{

    @Override
    public void createOrder() {
        System.out.println("inside OrderDAOImpl");
    }
}
