package com.course.companyms.service;

import java.util.List;

import com.course.companyms.model.Office;

public interface OfficeService {
    
    List<Office> findAll();

    Office findById(Long id);
}
