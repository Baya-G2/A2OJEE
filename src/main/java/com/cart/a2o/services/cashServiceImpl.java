package com.cart.a2o.services;

import com.cart.a2o.entities.cash;
import com.cart.a2o.entities.commands;
import com.cart.a2o.repositories.cashRepository;
import com.cart.a2o.services.cashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class cashServiceImpl implements cashService {

    @Autowired
    private cashRepository cashRepository;

    @Transactional
    @Override
    public cash processCashPayment(commands commands, cash cash) {
        // Validate cash payment details
        if (cash.getAmount() == null || cash.getAmount() <= 0 || cash.getCashTendered() == null || cash.getCashTendered() < cash.getAmount()) {
            throw new IllegalArgumentException("Invalid cash payment details");
        }

        // Set the command and the payment date
        cash.setCommands(commands);
        cash.setPayedAt(new Date());

        // Save the cash payment
        return cashRepository.save(cash);
    }

    @Transactional
    @Override
    public cash refundCashPayment(Long paymentId) {
        Optional<cash> cashOptional = cashRepository.findById(paymentId);
        if (!cashOptional.isPresent()) {
            throw new IllegalArgumentException("Cash payment not found");
        }

        cash cash = cashOptional.get();
        // Additional refund logic can be implemented here

        // For now, we just update the cash payment amount to indicate it has been refunded
        cash.setAmount(0.0); // or set a refund flag, or save refund details

        return cashRepository.save(cash);
    }

    @Override
    public cash getCashPaymentStatus(Long paymentId) {
        return cashRepository.findById(paymentId)
                .orElseThrow(() -> new IllegalArgumentException("Cash payment not found"));
    }

    @Override
    public void save(cash cash) {

    }

    public List<cash> getAllCashPayments() {
        return cashRepository.findAll();
    }
}
