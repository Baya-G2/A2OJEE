package com.cart.a2o.services;

import com.cart.a2o.entities.commands;
import com.cart.a2o.entities.payment;
import org.springframework.transaction.annotation.Transactional;

public interface paymentService {
    @Transactional
    payment processPayment(commands commands, payment payment);

    @Transactional
    payment refundPayment(Long paymentId);

    payment getPaymentStatus(Long paymentId);

    Object getAllpayments();

    void save(payment payment);
}
