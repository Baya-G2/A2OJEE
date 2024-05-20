package com.cart.a2o.services;

import com.cart.a2o.entities.payment;
import com.cart.a2o.entities.commands;
import com.cart.a2o.repositories.paymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;

@Service
public class paymentServiceImpl implements paymentService {

    @Autowired
    private paymentRepository paymentRepository;

    @Transactional
    @Override
    public payment processPayment(commands commands, payment payment) {
        // Validate payment details (additional validation can be implemented here)
        if (payment.getAmount() == null || payment.getAmount() <= 0) {
            throw new IllegalArgumentException("Invalid payment amount");
        }

        // Set the command and the payment date
        payment.setCommands(commands);
        payment.setPayedAt(new Date());

        // Save the payment
        return paymentRepository.save(payment);
    }

    @Transactional
    @Override
    public payment refundPayment(Long paymentId) {
        Optional<payment> paymentOptional = paymentRepository.findById(paymentId);
        if (!paymentOptional.isPresent()) {
            throw new IllegalArgumentException("Payment not found");
        }

        payment payment = paymentOptional.get();
        // Additional refund logic can be implemented here

        // For now, we just update the payment status to indicate it has been refunded
        payment.setAmount(0.0); // or set a refund flag, or save refund details

        return paymentRepository.save(payment);
    }

    @Override
    public payment getPaymentStatus(Long paymentId) {
        return paymentRepository.findById(paymentId)
                .orElseThrow(() -> new IllegalArgumentException("Payment not found"));
    }

    @Override
    public Object getAllpayments() {
        return null;
    }

    @Override
    public void save(payment payment) {

    }
}
