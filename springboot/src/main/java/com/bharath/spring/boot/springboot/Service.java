package com.bharath.spring.boot.springboot;

import org.springframework.stereotype.Component;

import com.bharath.spring.boot.springboot.dao.Dao;

@Component
public class Service {

	Dao dao;
	
	public Service(Dao dao) {
		this.dao = dao;
	}
	
	public void save() {
		dao.create();
	}
}
