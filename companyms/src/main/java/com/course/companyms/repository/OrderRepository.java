package com.course.companyms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.companyms.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
