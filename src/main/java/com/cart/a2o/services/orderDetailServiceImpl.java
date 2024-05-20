package com.cart.a2o.services;

import com.cart.a2o.entities.orderDetail;
import com.cart.a2o.repositories.orderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class orderDetailServiceImpl implements orderDetailService {

    @Autowired
    private orderDetailRepository orderDetailRepository;

    @Transactional
    @Override
    public orderDetail createOrderDetail(orderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    @Transactional
    @Override
    public orderDetail updateOrderDetail(Long orderDetailId, orderDetail orderDetail) {
        Optional<orderDetail> existingOrderDetailOptional = orderDetailRepository.findById(orderDetailId);
        if (!existingOrderDetailOptional.isPresent()) {
            throw new IllegalArgumentException("OrderDetail not found");
        }

        orderDetail existingOrderDetail = existingOrderDetailOptional.get();
        existingOrderDetail.setQuantity(orderDetail.getQuantity());
        existingOrderDetail.setProduct(orderDetail.getProduct());
        existingOrderDetail.setCommands(orderDetail.getCommands());
        return orderDetailRepository.save(existingOrderDetail);
    }

    @Transactional
    @Override
    public void deleteOrderDetail(Long orderDetailId) {
        if (!orderDetailRepository.existsById(orderDetailId)) {
            throw new IllegalArgumentException("OrderDetail not found");
        }
        orderDetailRepository.deleteById(orderDetailId);
    }

    @Override
    public orderDetail getOrderDetailById(Long orderDetailId) {
        return orderDetailRepository.findById(orderDetailId)
                .orElseThrow(() -> new IllegalArgumentException("OrderDetail not found"));
    }

    @Override
    public List<orderDetail> getAllOrderDetails() {
        return orderDetailRepository.findAll();
    }

    @Override
    public void save(orderDetail orderDetail) {

    }
}
