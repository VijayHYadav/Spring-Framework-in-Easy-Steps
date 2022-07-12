package com.bharath.spring.springadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bao")
public class OrderBOImpl implements OrderBO{

    @Autowired
    @Qualifier("dao2")
    private OrderDAO dao;

    @Override
    public void placeOrder() {
        System.out.println("Inside OrderBOImpl");
        dao.createOrder();
    }

    public OrderDAO getDao() {
        return dao;
    }

    public void setDao(OrderDAO dao) {
        this.dao = dao;
    }
}
