package com.course.companyms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.companyms.model.Employee;
import com.course.companyms.model.Message;
import com.course.companyms.service.EmployeeService;

@RestController
@RequestMapping(path = "/api/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok().body(employeeService.findAll()); 
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Employee> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(employeeService.findById(id)); 
    }

    @PostMapping(path = {"", "/"})
    public ResponseEntity<Message> save(@RequestBody(required = true) Employee employee){
        employeeService.save(employee);
        return ResponseEntity.ok().body(new Message("Employee Created")); 
    }

    @PutMapping(path = {"/{id}"})
    public ResponseEntity<Message> update(@RequestBody(required = true) Employee employee, 
                                @PathVariable("id") Long id){
        employee.setEmployeeNumber(id);
        employeeService.update(employee);
        return ResponseEntity.ok().body(new Message("Employee Updated"));
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<Message> delete(@PathVariable("id") Long id){
        employeeService.delete(employeeService.findById(id));
        return ResponseEntity.ok().body(new Message("Employee Deleted"));
    }
}

