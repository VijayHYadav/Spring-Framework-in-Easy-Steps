package com.bharath.spring.springadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    @Autowired
    @Qualifier("address12")
    private Address address;

    @Override
    public String toString() {
        return "Employee{" +
                ", address=" + address +
                '}';
    }
}
