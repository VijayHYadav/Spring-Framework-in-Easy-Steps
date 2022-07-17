package com.bharath.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bharath.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("vijay");
		employee1.setSalary(100000);

		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("ajay");
		employee2.setSalary(200000);
		
		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("sanjay");
		employee3.setSalary(300000);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		modelAndView.addObject("employees", employees);

		return modelAndView;
	}
}
