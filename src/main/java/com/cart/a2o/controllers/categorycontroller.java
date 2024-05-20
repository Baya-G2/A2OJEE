package com.cart.a2o.controllers;

import com.cart.a2o.entities.category;
import com.cart.a2o.services.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class categorycontroller {

    @Autowired
    private categoryService categoryService;

    @GetMapping("/createCategory")
    public String showCategoryForm(Model model) {
        model.addAttribute("category", new category());
        return "createcategory";
    }

    @PostMapping("/savecategory")
    public String saveCategory(@ModelAttribute("category") category category, BindingResult result) {
        if (result.hasErrors()) {
            return "createcategory";
        }
        categoryService.save(category);
        return "redirect:/categoryList";
    }

    @GetMapping("/categoryList")
    public String showCategoryList(Model model) {
        model.addAttribute("categoryList", categoryService.getAllCategories());
        return "categoryList";
    }
}
