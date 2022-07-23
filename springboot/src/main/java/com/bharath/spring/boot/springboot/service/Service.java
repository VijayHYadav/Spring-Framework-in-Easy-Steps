package com.bharath.spring.boot.springboot.service;

import org.springframework.stereotype.Component;

import com.bharath.spring.boot.springboot.dao.Dao;

@Component
public class Service {

	Dao dao;
	
	public Service(Dao dao) {
		System.out.println("Service Bean Created");
		this.dao = dao;
	}
	
	public void save() {
		dao.create();
	}
}
