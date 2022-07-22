package com.bharat.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DaoConfig.class)
public class SpringConfig {

//	@Bean
//	public Dao dao() {
//		return new Dao();
//	}
	
	@Bean
	public Service service() {
		return new Service();
	}
}
