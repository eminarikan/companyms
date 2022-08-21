package com.course.companyms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.companyms.model.Office;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Long>{
    
}
