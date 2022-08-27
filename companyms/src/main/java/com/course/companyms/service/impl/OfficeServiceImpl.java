package com.course.companyms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.companyms.model.Office;
import com.course.companyms.repository.OfficeRepository;
import com.course.companyms.service.OfficeService;

@Service
public class OfficeServiceImpl implements OfficeService{
    @Autowired
    private OfficeRepository officeRepository;

    @Override
    public List<Office> findAll() {
        
        return officeRepository.findAll();
    }

    @Override
    public Office findById(Long id) {
        return officeRepository.findById(id).get();
    }

    @Override
    public void save(Office office) {
        officeRepository.save(office);
    }

    @Override
    public void update(Office office) {
        officeRepository.save(office);
    }

    @Override
    public void delete(Office office) {
        officeRepository.delete(office);
    }
}
