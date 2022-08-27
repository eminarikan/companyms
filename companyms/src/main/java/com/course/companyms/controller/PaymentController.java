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
import com.course.companyms.model.Payment;
import com.course.companyms.service.PaymentService;


@RestController
@RequestMapping(path = "/api/payments")
public class PaymentController {
    
    @Autowired
    PaymentService paymentService;

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<Payment>> getAll(){
        return ResponseEntity.ok().body(paymentService.findAll()); 
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Payment> getById(@PathVariable("id") String id){
        return ResponseEntity.ok().body(paymentService.findById(id)); 
    }

    @PostMapping(path = {"", "/"})
    public ResponseEntity<Message> save(@RequestBody(required = true) Payment payment){
        paymentService.save(payment);
        return ResponseEntity.ok().body(new Message("Payment Created")); 
    }

    @PutMapping(path = {"/{id}"})
    public ResponseEntity<Message> update(@RequestBody(required = true) Payment payment, 
                                @PathVariable("id") String id){
        payment.setCheckNumber(id);
        paymentService.update(payment);
        return ResponseEntity.ok().body(new Message("Payment Updated"));
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<Message> delete(@PathVariable("id") String id){
        paymentService.delete(paymentService.findById(id));
        return ResponseEntity.ok().body(new Message("Payment Deleted"));
    }
}
