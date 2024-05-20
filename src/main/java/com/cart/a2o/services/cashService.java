package com.cart.a2o.services;

import com.cart.a2o.entities.cash;
import com.cart.a2o.entities.commands;
import org.springframework.transaction.annotation.Transactional;

public interface cashService {
    @Transactional
    cash processCashPayment(commands commands, cash cash);

    @Transactional
    cash refundCashPayment(Long paymentId);

    cash getCashPaymentStatus(Long paymentId);

    void save(cash cash);

    Object getAllCashPayments();
}
