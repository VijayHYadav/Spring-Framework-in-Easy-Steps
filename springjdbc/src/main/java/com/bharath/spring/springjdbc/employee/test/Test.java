package com.bharath.spring.springjdbc.employee.test;

import com.bharath.spring.springjdbc.employee.dao.EmployeeDao;
import com.bharath.spring.springjdbc.employee.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    public static  void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("createConfig.xml");
        EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");
        Employee employee = new Employee();
        employee.setId(2);
        employee.setFirtname("Vishal");
        employee.setLastname("Yadav");
        int result = dao.delete(1);
        System.out.println("Number of result : "+result);
    }
}
