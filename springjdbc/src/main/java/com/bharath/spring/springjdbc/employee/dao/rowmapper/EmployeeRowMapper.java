package com.bharath.spring.springjdbc.employee.dao.rowmapper;

import com.bharath.spring.springjdbc.employee.dto.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new  Employee();
        employee.setId(resultSet.getInt(1));
        employee.setFirtname(resultSet.getString(2));
        employee.setLastname(resultSet.getString(3));
        return employee;
    }
}
