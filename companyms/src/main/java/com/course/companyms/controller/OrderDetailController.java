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
import com.course.companyms.model.OrderDetail;
import com.course.companyms.model.OrderDetailId;
import com.course.companyms.model.Product;
import com.course.companyms.service.OrderDetailService;
import com.course.companyms.service.OrderService;
import com.course.companyms.service.ProductService;

@RestController
@RequestMapping(path = "/api/orderdetails")
public class OrderDetailController {
    
    @Autowired
    private OrderDetailService orderDetailService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<OrderDetail>> getAll(){
        return ResponseEntity.ok().body(orderDetailService.findAll());
    }

    @GetMapping(path = "/{orderNumber}/{productCode}")
    public ResponseEntity<OrderDetail> getById(
        @PathVariable("orderNumber") Long orderNumber, 
        @PathVariable("productCode") String productCode){
            Order o = orderService.findById(orderNumber);
            Product p = productService.findById(productCode);

            OrderDetailId odi = new OrderDetailId();
            odi.setOrder(o);
            odi.setProduct(p);

            OrderDetail od = orderDetailService.findById(odi);

            return ResponseEntity.ok().body(od);
    }

    @PostMapping(path = {"", "/"})
    public ResponseEntity<Message> create(@RequestBody(required = true) OrderDetail orderDetail){

        orderDetailService.save(orderDetail);

        return ResponseEntity.ok().body(new Message("Order Detail Created"));
    }

    @PutMapping(path = "/{orderNumber}/{productCode}")
    public ResponseEntity<Message> update(
        @PathVariable("orderNumber") Long orderNumber, 
        @PathVariable("productCode") String productCode,
        @RequestBody(required = true) OrderDetail orderDetail){
            
            Order o = orderService.findById(orderNumber);
            Product p = productService.findById(productCode);

            OrderDetailId odi = new OrderDetailId();
            odi.setOrder(o);
            odi.setProduct(p);

            orderDetail.setId(odi);

            orderDetailService.update(orderDetail);

            return ResponseEntity.ok().body(new Message("Order Detail Updated"));
    }

    @DeleteMapping(path = "/{orderNumber}/{productCode}")
    public ResponseEntity<Message> delete(
        @PathVariable("orderNumber") Long orderNumber, 
        @PathVariable("productCode") String productCode){
            
            Order o = orderService.findById(orderNumber);
            Product p = productService.findById(productCode);

            OrderDetailId odi = new OrderDetailId();
            odi.setOrder(o);
            odi.setProduct(p);

            

            orderDetailService.delete(orderDetailService.findById(odi));

            return ResponseEntity.ok().body(new Message("Order Detail Deleted"));
    }
}
