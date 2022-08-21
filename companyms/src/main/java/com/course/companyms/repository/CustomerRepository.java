package com.course.companyms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.companyms.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
