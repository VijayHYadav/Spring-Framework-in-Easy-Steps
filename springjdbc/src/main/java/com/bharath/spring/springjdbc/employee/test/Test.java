package com.bharath.spring.springjdbc.employee.test;

import com.bharath.spring.springjdbc.employee.dao.EmployeeDao;
import com.bharath.spring.springjdbc.employee.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Test {
    public static  void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("createConfig.xml");
        EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");
        List<Employee> result = dao.read();
        System.out.println("Number of result : "+result);
    }
}
