package com.course.companyms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.companyms.repository.ProductLineRepository;
import com.course.companyms.service.ProductLineService;

@Service
public class ProductLineServiceImpl implements ProductLineService{
    @Autowired
    private ProductLineRepository productLineRepository;
}
