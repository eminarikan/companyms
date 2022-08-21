package com.course.companyms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.companyms.model.ProductLine;

@Repository
public interface ProductLineRepository extends JpaRepository<ProductLine, String>{
    
}
