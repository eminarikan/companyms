package com.course.companyms.service;

import java.util.List;

import com.course.companyms.model.Employee;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(Long id);
    void save(Employee employee);
    void update(Employee employee);
    void delete(Employee employee);
}
