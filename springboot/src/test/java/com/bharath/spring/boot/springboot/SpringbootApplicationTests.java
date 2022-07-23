package com.bharath.spring.boot.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.bharath.spring.boot.springboot.service.Service;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	public void testService() {
		Service service = context.getBean(Service.class);
		service.save();
	}

}
