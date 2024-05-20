package com.cart.a2o.services;

import com.cart.a2o.entities.check;
import com.cart.a2o.entities.commands;
import org.springframework.transaction.annotation.Transactional;

public interface checkService {
    @Transactional
    check processCheckPayment(commands commands, check check);

    @Transactional
    check refundCheckPayment(Long paymentId);

    check getCheckPaymentStatus(Long paymentId);
}
