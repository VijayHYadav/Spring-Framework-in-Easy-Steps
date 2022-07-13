package com.bharath.spring.springjdbc.employee.dao;

import com.bharath.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {

    int create(Employee employee);
    int update(Employee employee);
    int delete(int id);
}
