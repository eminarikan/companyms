package com.course.companyms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.course.companyms.model.Office;
import com.course.companyms.service.OfficeService;


@Controller
@RequestMapping(path = "/api/offices")
public class OfficeController {
    // CRUD

    @Autowired
    private OfficeService officeService;

    //READ read one, read all

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<Office>> index(){
        return ResponseEntity.ok(officeService.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Office> readOne(@PathVariable("id") Long id){
        return ResponseEntity.ok(officeService.findById(id));
    }
}
