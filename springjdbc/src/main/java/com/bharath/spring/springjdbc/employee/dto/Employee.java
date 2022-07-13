package com.bharath.spring.springjdbc.employee.dto;

public class Employee {

    private int id;
    private String firtname;
    private String lastname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirtname() {
        return firtname;
    }

    public void setFirtname(String firtname) {
        this.firtname = firtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firtname='" + firtname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
