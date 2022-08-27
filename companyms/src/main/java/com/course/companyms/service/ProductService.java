package com.course.companyms.service;

import java.util.List;

import com.course.companyms.model.Product;

public interface ProductService {
    List<Product> findAll();
    Product findById(String id);
    void save(Product product);
    void update(Product product);
    void delete(Product product);
}
