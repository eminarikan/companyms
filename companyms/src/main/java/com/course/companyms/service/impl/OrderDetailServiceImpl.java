package com.course.companyms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.companyms.model.OrderDetail;
import com.course.companyms.model.OrderDetailId;
import com.course.companyms.repository.OrderDetailRepository;
import com.course.companyms.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public List<OrderDetail> findAll() {
        return orderDetailRepository.findAll();
    }

    @Override
    public OrderDetail findById(OrderDetailId id) {
        return orderDetailRepository.findById(id).get();
    }

    @Override
    public void save(OrderDetail orderDetail) {
        orderDetailRepository.save(orderDetail);
    }

    @Override
    public void update(OrderDetail orderDetail) {
        orderDetailRepository.save(orderDetail);
    }

    @Override
    public void delete(OrderDetail orderDetail) {
        orderDetailRepository.delete(orderDetail);
    }

}
