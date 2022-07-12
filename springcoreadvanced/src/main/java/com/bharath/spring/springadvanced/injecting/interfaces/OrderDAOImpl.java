package com.bharath.spring.springadvanced.injecting.interfaces;

public class OrderDAOImpl implements OrderDAO{

    @Override
    public void createOrder() {
        System.out.println("inside OrderDAOImpl");
    }
}
