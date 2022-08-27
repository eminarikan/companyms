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

import com.course.companyms.model.Customer;
import com.course.companyms.model.Message;
import com.course.companyms.service.CustomerService;

@RestController
@RequestMapping(path = "/api/customers")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<Customer>> getAll(){
        return ResponseEntity.ok().body(customerService.findAll()); 
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Customer> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(customerService.findById(id)); 
    }

    @PostMapping(path = {"", "/"})
    public ResponseEntity<Message> save(@RequestBody(required = true) Customer customer){
        customerService.save(customer);
        return ResponseEntity.ok().body(new Message("Customer Created")); 
    }

    @PutMapping(path = {"/{id}"})
    public ResponseEntity<Message> update(@RequestBody(required = true) Customer customer, 
                                @PathVariable("id") Long id){
        customer.setCustomerNumber(id);
        customerService.update(customer);
        return ResponseEntity.ok().body(new Message("Customer Updated"));
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<Message> delete(@PathVariable("id") Long id){
        customerService.delete(customerService.findById(id));
        return ResponseEntity.ok().body(new Message("Customer Deleted"));
    }
}
