package com.course.companyms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.companyms.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>{
    
}
