package com.bharath.spring.springadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
//    @Autowired
    private Address address;

    @Autowired
    public Employee(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", address=" + address +
                '}';
    }
}
