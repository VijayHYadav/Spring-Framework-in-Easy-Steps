package com.bharath.spring.springorm.product.test;

import com.bharath.spring.springorm.product.dao.ProductDao;
import com.bharath.spring.springorm.product.entity.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ProductDao productDao  = (ProductDao) context.getBean("productDao");
        Product product = new Product();
        product.setId(1);
        product.setName("IPHONE");
        product.setPrice(700);
        productDao.create(product);
    }
}
