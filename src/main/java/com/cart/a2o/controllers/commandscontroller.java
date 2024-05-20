package com.cart.a2o.controllers;

import com.cart.a2o.entities.commands;
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
public class commandscontroller {
    private com.cart.a2o.services.commandsService commandsService;
    @RequestMapping("/createcommands")
    public String createcommands(){
        return "createcommands";
    }
    @RequestMapping("savecommands")
    public String savecommands(@ModelAttribute("commands") commands commands){
        commands savecommands = commandsService.savecommands(commands);
        return "createcommands";
    }
    @RequestMapping("/commandsList")
    public String commandsList(ModelMap modelMap){
        List<commands> commandsList = commandsService.getAllcommandss();
        modelMap.addAttribute("commandsVue", commandsList);
        return "commandsList";
    }


    @RequestMapping("/deletecommands")
    public String deletecommands(@RequestParam("id") Long id, ModelMap modelMap){
        commandsService.deletecommandsbyId(id);
        return commandsList(modelMap);
    }
    @RequestMapping("/editcommands")
    public String editcommands(@RequestParam("id") Long id, ModelMap modelMap){
        commands commands = commandsService.getcommandsbyId(id);
        modelMap.addAttribute("commandsView", commands);
        return "editcommands";
    }
}
