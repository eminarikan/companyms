package com.course.companyms.service;

import java.util.List;

import com.course.companyms.model.Office;

public interface OfficeService {
    
    List<Office> findAll();

    Office findById(Long id);

    void save(Office office);

    void update(Office office);

    void delete(Office office);
}
