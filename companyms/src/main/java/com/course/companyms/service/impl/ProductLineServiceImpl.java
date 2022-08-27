package com.course.companyms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.companyms.model.ProductLine;
import com.course.companyms.repository.ProductLineRepository;
import com.course.companyms.service.ProductLineService;

@Service
public class ProductLineServiceImpl implements ProductLineService{
    @Autowired
    private ProductLineRepository productLineRepository;

    @Override
    public List<ProductLine> findAll() {
        return productLineRepository.findAll();
    }

    @Override
    public ProductLine findById(String id) {
        return productLineRepository.findById(id).get();
    }

    @Override
    public void save(ProductLine productLine) {
        productLineRepository.save(productLine);
    }

    @Override
    public void update(ProductLine productLine) {
        productLineRepository.save(productLine);
    }

    @Override
    public void delete(ProductLine productLine) {
        productLineRepository.delete(productLine);
    }
}
