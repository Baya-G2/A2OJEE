package com.cart.a2o.controllers;

import com.cart.a2o.entities.cash;
import com.cart.a2o.services.cashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class cashcontroller {

    @Autowired
    private cashService cashService;

    @GetMapping("/createCash")
    public String showCashForm(Model model) {
        model.addAttribute("cash", new cash());
        return "createCash";
    }

    @PostMapping("/saveCash")
    public String saveCash(@ModelAttribute("cash") cash cash, BindingResult result) {
        if (result.hasErrors()) {
            return "createCash";
        }
        cashService.save(cash);
        return "redirect:/cashList";
    }

    @GetMapping("/cashList")
    public String showCashList(Model model) {
        model.addAttribute("cashList", cashService.getAllCashPayments());
        return "cashList";
    }
}
