package com.bharath.spring.springmvc.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;

public class WebServletConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext webContext = new AnnotationConfigApplicationContext();
		webContext.register(SpringConfig.class);
	}

}
