package com.cart.a2o.controllers;

import com.cart.a2o.entities.orderDetail;
import com.cart.a2o.entities.product;
import com.cart.a2o.entities.commands;
import com.cart.a2o.services.orderDetailService;
import com.cart.a2o.services.productService;
import com.cart.a2o.services.commandsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class orderDetailcontroller {

    @Autowired
    private orderDetailService orderDetailService;

    @Autowired
    private productService productService;

    @Autowired
    private commandsService commandsService;

    @GetMapping("/createOrderDetail")
    public String showOrderDetailForm(Model model) {
        model.addAttribute("orderDetail", new orderDetail());
        model.addAttribute("products", productService.getAllProducts());
        model.addAttribute("commands", commandsService.getAllCommands());
        return "createOrderDetail";
    }

    @PostMapping("/saveOrderDetail")
    public String saveOrderDetail(@ModelAttribute("orderDetail") orderDetail orderDetail, BindingResult result) {
        if (result.hasErrors()) {
            return "createOrderDetail";
        }
        orderDetailService.save(orderDetail);
        return "redirect:/orderDetailsList";
    }

    @GetMapping("/orderDetailsList")
    public String showOrderDetailList(Model model) {
        model.addAttribute("orderDetailList", orderDetailService.getAllOrderDetails());
        return "orderDetailsList";
    }
}
