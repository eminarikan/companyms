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
import com.course.companyms.model.Product;
import com.course.companyms.service.ProductService;


@RestController
@RequestMapping(path = "/api/products")
public class ProductController {
    
    @Autowired
    ProductService productService;

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok().body(productService.findAll()); 
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Product> getById(@PathVariable("id") String id){
        return ResponseEntity.ok().body(productService.findById(id)); 
    }

    @PostMapping(path = {"", "/"})
    public ResponseEntity<Message> save(@RequestBody(required = true) Product product){
        productService.save(product);
        return ResponseEntity.ok().body(new Message("Product Created")); 
    }

    @PutMapping(path = {"/{id}"})
    public ResponseEntity<Message> update(@RequestBody(required = true) Product product, 
                                @PathVariable("id") String id){
        product.setProductCode(id);
        productService.update(product);
        return ResponseEntity.ok().body(new Message("Product Updated"));
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<Message> delete(@PathVariable("id") String id){
        productService.delete(productService.findById(id));
        return ResponseEntity.ok().body(new Message("Product Deleted"));
    }
}
