package com.cart.a2o.controllers;

import com.cart.a2o.entities.cash;
import com.cart.a2o.entities.check;
import com.cart.a2o.entities.payment;
import com.cart.a2o.services.paymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class paymentcontroller {

    @Autowired
    private paymentService paymentService;

    @GetMapping("/createPayment")
    public String showPaymentForm(Model model) {
        model.addAttribute("payment", new payment());
        return "createPayment";
    }

    @PostMapping("/savePayment")
    public String savePayment(@ModelAttribute("payment") payment payment, BindingResult result, @RequestParam("paymentType") String paymentType) {
        if (result.hasErrors()) {
            return "createPayment";
        }

        if (paymentType.equals("CASH")) {
            cash cash = new cash();
            cash.setAmount(payment.getAmount());
            cash.setPayedAt(payment.getPayedAt());
            cash.setCommands(payment.getCommands());
            cash.setCashTendered(((cash) payment).getCashTendered());
            paymentService.save(cash);
        } else if (paymentType.equals("CHECK")) {
            check check = new check();
            check.setAmount(payment.getAmount());
            check.setPayedAt(payment.getPayedAt());
            check.setCommands(payment.getCommands());
            check.setBankName(((check) payment).getBankName());
            check.setBankId(((check) payment).getBankId());
            paymentService.save(check);
        } else {
            paymentService.save(payment);
        }

        return "redirect:/paymentsList";
    }

    @GetMapping("/paymentsList")
    public String showPaymentList(Model model) {
        model.addAttribute("paymentList", paymentService.getAllpayments());
        return "paymentsList";
    }
}
