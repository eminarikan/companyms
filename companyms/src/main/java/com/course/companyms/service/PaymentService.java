package com.course.companyms.service;

import java.util.List;

import com.course.companyms.model.Payment;

public interface PaymentService {
    List<Payment> findAll();
    Payment findById(String id);
    void save(Payment payment);
    void update(Payment payment);
    void delete(Payment payment);
}
