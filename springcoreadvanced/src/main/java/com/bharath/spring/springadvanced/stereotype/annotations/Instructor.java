package com.bharath.spring.springadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("guru")
@Scope("singleton")
public class Instructor {

//    @Value("#{new Integer(786)}")
    @Value("#{T(java.lang.Integer).MIN_VALUE}")
    private int id = 62;

//    @Value("bharath")
//  @Value("#{'vijay.h.yadav'.toUpperCase()}")
    @Value("#{new java.lang.String('catti')}")
    private String name = "vijay";
    @Value("#{topics}")
    private List<String> topics;

    @Autowired
    private Profile profile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", topics=" + topics +
                ", profile=" + profile +
                '}';
    }
}
