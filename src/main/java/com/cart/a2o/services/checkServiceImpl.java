package com.cart.a2o.services;

import com.cart.a2o.entities.check;
import com.cart.a2o.entities.commands;
import com.cart.a2o.repositories.checkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;

@Service
public class checkServiceImpl implements checkService {

    @Autowired
    private checkRepository checkRepository;

    @Transactional
    @Override
    public check processCheckPayment(commands commands, check check) {
        // Validate check payment details
        if (check.getAmount() == null || check.getAmount() <= 0 || check.getBankName() == null || check.getBankId() == null) {
            throw new IllegalArgumentException("Invalid check payment details");
        }

        // Set the command and the payment date
        check.setCommands(commands);
        check.setPayedAt(new Date());

        // Save the check payment
        return checkRepository.save(check);
    }

    @Transactional
    @Override
    public check refundCheckPayment(Long paymentId) {
        Optional<check> checkOptional = checkRepository.findById(paymentId);
        if (!checkOptional.isPresent()) {
            throw new IllegalArgumentException("Check payment not found");
        }

        check check = checkOptional.get();
        // Additional refund logic can be implemented here

        // For now, we just update the check payment amount to indicate it has been refunded
        check.setAmount(0.0); // or set a refund flag, or save refund details

        return checkRepository.save(check);
    }

    @Override
    public check getCheckPaymentStatus(Long paymentId) {
        return checkRepository.findById(paymentId)
                .orElseThrow(() -> new IllegalArgumentException("Check payment not found"));
    }
}
