package com.course.companyms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.companyms.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String>{
    
}
