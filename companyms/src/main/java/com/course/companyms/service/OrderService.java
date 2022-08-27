package com.course.companyms.service;

import java.util.List;

import com.course.companyms.model.Order;

public interface OrderService {
    List<Order> findAll();
    Order findById(Long id);
    void save(Order order);
    void update(Order order);
    void delete(Order order);
}
