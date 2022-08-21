package com.course.companyms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.companyms.repository.CustomerRepository;
import com.course.companyms.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
    
    @Autowired
    private CustomerRepository customerRepository;
}
