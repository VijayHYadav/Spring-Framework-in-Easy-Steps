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

    @Override
    public int update(Employee employee) {
        String sql = "update employee set firstname=?,lastname=? where id=?";
        int result = jdbcTemplate.update(sql, employee.getFirtname(), employee.getLastname(), employee.getId());
        return result;
    }

    @Override
    public int delete(int id) {
        String sql = "delete from employee where id=?";
        int result = jdbcTemplate.update(sql, id);
        return result;
    }

    @Override
    public Employee read(int id) {
        String sql = "select * from employee where id = ?";
        jdbcTemplate.queryForList(sql, ""); // still gonna need coding here...
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
