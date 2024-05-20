package com.cart.a2o.services;

import com.cart.a2o.entities.orderDetail;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface orderDetailService {
    @Transactional
    orderDetail createOrderDetail(orderDetail orderDetail);

    @Transactional
    orderDetail updateOrderDetail(Long orderDetailId, orderDetail orderDetail);

    @Transactional
    void deleteOrderDetail(Long orderDetailId);

    orderDetail getOrderDetailById(Long orderDetailId);

    List<orderDetail> getAllOrderDetails();

    void save(orderDetail orderDetail);
}
