package com.bharath.spring.springadvanced.injecting.interfaces;

public class OrderBOImpl implements OrderBO{
    @Override
    public void placeOrder() {
        System.out.println("Inside OrderBOImpl");
    }
}
