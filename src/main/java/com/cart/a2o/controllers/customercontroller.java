package com.cart.a2o.controllers;

import com.cart.a2o.entities.customer;
import com.cart.a2o.services.customerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class customercontroller {
    private customerService customerService;
    @RequestMapping("/createcustomer")
    public String createcustomer(){
        return "createcustomer";
    }
    @RequestMapping("savecustomer")
    public String savecustomer(@ModelAttribute("customer")customer customer){
        customer savecustomer = customerService.savecustomer(customer);
        return "createcustomer";
    }
    @RequestMapping("/customersList")
    public String customersList(ModelMap modelMap){
        List<customer> customerscontroller = customerService.getAllcustomers();
        modelMap.addAttribute("customersVue", customerscontroller);
        return "customersList";
    }
    @RequestMapping("/deletecustomer")
    public String deletecustomer(@RequestParam("id") Long id, ModelMap modelMap){
        customerService.deletecustomerbyId(id);
        return customersList(modelMap);
    }
    @RequestMapping("/editcustomer")
    public String editCustomer(@RequestParam("id") Long id, ModelMap modelMap){
        customer customer = customerService.getcustomerbyId(id);
        modelMap.addAttribute("customerView", customer);
        return "editcustomer";
    }

}
