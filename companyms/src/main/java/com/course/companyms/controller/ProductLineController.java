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
import com.course.companyms.model.ProductLine;
import com.course.companyms.service.ProductLineService;

@RestController
@RequestMapping(path = "/api/productlines")
public class ProductLineController {
    
    @Autowired
    private ProductLineService productLineService;

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<ProductLine>> getAll(){
        return ResponseEntity.ok().body(productLineService.findAll()); 
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<ProductLine> getById(@PathVariable("id") String id){
        return ResponseEntity.ok().body(productLineService.findById(id)); 
    }

    @PostMapping(path = {"", "/"})
    public ResponseEntity<Message> save(@RequestBody(required = true) ProductLine productLine){
        productLineService.save(productLine);
        return ResponseEntity.ok().body(new Message("Product Line Created")); 
    }

    @PutMapping(path = {"/{id}"})
    public ResponseEntity<Message> update(@RequestBody(required = true) ProductLine productLine, 
                                @PathVariable("id") String id){
                                    productLine.setProductLine(id);
        productLineService.update(productLine);
        return ResponseEntity.ok().body(new Message("Product Line Updated"));
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<Message> delete(@PathVariable("id") String id){
        productLineService.delete(productLineService.findById(id));
        return ResponseEntity.ok().body(new Message("Product Line Deleted"));
    }

}
