package com.course.companyms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.course.companyms.model.Info;

@Controller
@RequestMapping(path="/api/info")
public class InfoController {
    
    @GetMapping(path = {"", "/"})
    public ResponseEntity<Info> index(){
        Info info = new Info();
        info.setServiceName("CompanyMS");
        info.setDescription("Company Magement System Web Service");
        info.setBaseEndpoint("/api");
        String [] sources = {
            "/customers", 
            "/employees",
            "/offices",
            "/orders",
            "/order-details",
            "/payments",
            "/products",
            "/product-lines"}; 
        info.setSources(sources);

        return ResponseEntity.ok(info);
    }
}
