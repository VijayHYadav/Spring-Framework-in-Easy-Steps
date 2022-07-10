package com.bharath.spring.springcore.constructorinjection.ambiguity;

public class Addition {


    Addition(double a,double b) {
        System.out.println("Inside Constructor Double");
    }
    Addition(int a,int b) {
        System.out.println("Inside Constructor INT");
    }

    Addition(String a, String b) {
        System.out.println("Inside Constructor String");
    }
}
