package com.course.companyms.service;

import java.util.List;

import com.course.companyms.model.OrderDetail;
import com.course.companyms.model.OrderDetailId;

public interface OrderDetailService {
    List<OrderDetail> findAll();

    OrderDetail findById(OrderDetailId id);

    void save(OrderDetail orderDetail);

    void update(OrderDetail orderDetail);

    void delete(OrderDetail orderDetail);
}
