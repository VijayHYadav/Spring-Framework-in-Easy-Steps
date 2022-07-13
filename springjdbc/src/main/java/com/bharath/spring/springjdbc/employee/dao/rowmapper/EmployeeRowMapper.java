package com.bharath.spring.springjdbc.employee.dao.rowmapper;

import com.bharath.spring.springjdbc.employee.dto.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
