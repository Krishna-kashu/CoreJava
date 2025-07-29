package com.myworks.greendress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class RTOController {
    public RTOController(){
        System.out.println("RTO controller");
    }

    @RequestMapping("/submitRTO")
    public String onSubmit(@RequestParam String vehicleNumber, @RequestParam String ownerName, @RequestParam String vehicleType, @RequestParam String registrationDate, @RequestParam String state, @RequestParam String contact, Model model){
        System.out.println("onSubmit RTOController");

        model.addAttribute("vehicleNumber",vehicleNumber);
        model.addAttribute("ownerName", ownerName);
        model.addAttribute("vehicleType", vehicleType);
        model.addAttribute("registrationDate", registrationDate);
        model.addAttribute("state", state);
        model.addAttribute("contact", contact);

        System.out.println("vehicleNumber: " +vehicleNumber+ ", ownerName: " + ownerName + ", vehicleType: " + vehicleType + ", registrationDate: " + registrationDate + ", state: " + state + ", contact: " + contact);
        return "result.jsp";
    }
}
