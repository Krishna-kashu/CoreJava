package com.myworks.greendress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HospitalController {
    public HospitalController(){

        System.out.println("no arg constructor of HospitalController");
    }

    @RequestMapping("/submitHospital")
    public String onSubmit(@RequestParam String hospitalName, @RequestParam String address, @RequestParam String city, @RequestParam String state, @RequestParam String pincode, @RequestParam String phone, Model model){
        System.out.println("onSubmit HospitalController");

        model.addAttribute("hospitalName",hospitalName);
        model.addAttribute("address", address);
        model.addAttribute("city", city);
        model.addAttribute("state", state);
        model.addAttribute("pincode", pincode);
        model.addAttribute("phone", phone);

        System.out.println("Name" +hospitalName+ "Address" + address+ "City" + city+ "State" + state+ "Pincode" + pincode+ "Phone" +phone);
        return "result.jsp";
    }
}
