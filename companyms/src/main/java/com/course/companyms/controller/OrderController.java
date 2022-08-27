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

import com.course.companyms.model.Message;
import com.course.companyms.model.Order;
import com.course.companyms.service.OrderService;

@RestController
@RequestMapping(path = "/api/orders")
public class OrderController {
    
    @Autowired
    private OrderService orderService;

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<Order>> getAll(){
        return ResponseEntity.ok().body(orderService.findAll()); 
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Order> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(orderService.findById(id)); 
    }

    @PostMapping(path = {"", "/"})
    public ResponseEntity<Message> save(@RequestBody(required = true) Order order){
        orderService.save(order);
        return ResponseEntity.ok().body(new Message("Order Created")); 
    }

    @PutMapping(path = {"/{id}"})
    public ResponseEntity<Message> update(@RequestBody(required = true) Order order, 
                                @PathVariable("id") Long id){
        order.setOrderNumber(id);
        orderService.update(order);
        return ResponseEntity.ok().body(new Message("Order Updated"));
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<Message> delete(@PathVariable("id") Long id){
        orderService.delete(orderService.findById(id));
        return ResponseEntity.ok().body(new Message("Order Deleted"));
    }
}

