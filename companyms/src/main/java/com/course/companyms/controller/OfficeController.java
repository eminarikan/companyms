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
import com.course.companyms.model.Office;
import com.course.companyms.service.OfficeService;


@RestController
@RequestMapping(path = "/api/offices")
public class OfficeController {
    // CRUD

    @Autowired
    private OfficeService officeService;

    //READ read one, read all

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<Office>> getAllOffices(){
        return ResponseEntity.ok(officeService.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Office> getOfficeById(@PathVariable("id") Long id){
        return ResponseEntity.ok(officeService.findById(id));
    }

    // CREATE   /offices  POST create  json 

    @PostMapping(path = {"", "/"})
    public ResponseEntity<Message> addOffice(@RequestBody(required = true) Office office){

        officeService.save(office);

        return ResponseEntity.ok().body(new Message("Office Created"));
    }

    // UPDATE /offices/{id}  PUT json 
    @PutMapping(path = "/{id}")
    public ResponseEntity<Message> updateOffice(@RequestBody(required = true) Office office,
        @PathVariable("id") Long id){
            office.setOfficeCode(id);
            officeService.update(office);   
            return ResponseEntity.ok().body(new Message("Office Updated"));
    }

    // DELETE /offices/{id} DELETE 
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Message> deleteOffice(@PathVariable("id") Long id){

        officeService.delete(officeService.findById(id));

        return ResponseEntity.ok().body(new Message("Office Deleted"));
    }

}
