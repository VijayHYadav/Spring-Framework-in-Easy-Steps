package com.bharath.spring.springjdbc.employee.dao.impl;

import com.bharath.spring.springjdbc.employee.dao.EmployeeDao;
import com.bharath.spring.springjdbc.employee.dto.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Employee employee) {
        String sql = "insert into employee values(?,?,?)";
        int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirtname(), employee.getLastname());
        return result;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
