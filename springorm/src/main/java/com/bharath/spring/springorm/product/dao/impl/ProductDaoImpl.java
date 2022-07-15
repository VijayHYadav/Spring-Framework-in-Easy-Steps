package com.bharath.spring.springorm.product.dao.impl;

import com.bharath.spring.springorm.product.dao.ProductDao;
import com.bharath.spring.springorm.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    HibernateTemplate hibernateTemplate;

    @Override
    public int create(Product product) {
        return 0;
    }
}
