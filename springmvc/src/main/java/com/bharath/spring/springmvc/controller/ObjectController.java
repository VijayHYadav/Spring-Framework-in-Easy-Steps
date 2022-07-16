package com.bharath.spring.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;

import com.bharath.spring.springmvc.dto.Employee;

public class ObjectController {

	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("vijay");
		employee.setSalary(100000);
		modelAndView.addObject("employee", employee);

		return modelAndView;
	}
}
