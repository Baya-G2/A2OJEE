package com.cart.a2o.controllers;

import com.cart.a2o.entities.customer;
import com.cart.a2o.entities.product;
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
public class productcontroller {
    private com.cart.a2o.services.productService productService;
    @RequestMapping("/createproduct")
    public String createproduct(){
        return "createproduct";
    }
    @RequestMapping("saveproduct")
    public String saveproduct(@ModelAttribute("product") product product){
        product saveproduct = productService.saveproduct(product);
        return "createproduct";
    }
    @RequestMapping("/productsList")
    public String productsList(ModelMap modelMap){
        List<product> productscontroller = productService.getAllproducts();
        modelMap.addAttribute("productsVue", productscontroller);
        return "productsList";
    }
    @RequestMapping("/deleteproduct")
    public String deleteproduct(@RequestParam("id") Long id, ModelMap modelMap){
        productService.deleteproductbyId(id);
        return productsList(modelMap);
    }
    @RequestMapping("/editproduct")
    public String editproduct(@RequestParam("id") Long id, ModelMap modelMap){
        product product = productService.getproductbyId(id);
        modelMap.addAttribute("productView", product);
        return "editproduct";
    }
}
