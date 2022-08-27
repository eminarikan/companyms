package com.course.companyms.service;

import java.util.List;

import com.course.companyms.model.Customer;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(Long id);
    void save(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
}
