package com.bharath.spring.springorm.product.dao.impl;

import com.bharath.spring.springorm.product.dao.ProductDao;
import com.bharath.spring.springorm.product.entity.Product;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class ProductDaoImpl implements ProductDao {

    HibernateTemplate hibernateTemplate;

    @Override
    public int create(Product product) {
        return 0;
    }
}
