package com.course.companyms.service;

import java.util.List;

import com.course.companyms.model.ProductLine;

public interface ProductLineService {
    List<ProductLine> findAll();
    ProductLine findById(String id);
    void save(ProductLine productLine);
    void update(ProductLine productLine);
    void delete(ProductLine productLine);
}
