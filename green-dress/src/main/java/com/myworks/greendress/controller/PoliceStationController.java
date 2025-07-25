package com.myworks.greendress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PoliceStationController {
    public PoliceStationController(){
        System.out.println("Police station controller");
    }
    @RequestMapping("/submitPolice")
    public String onSubmit(@RequestParam String stationName,
                           @RequestParam String location,
                           @RequestParam String city,
                           @RequestParam String pincode,
                           @RequestParam String state,
                           @RequestParam String phone,
                           @RequestParam String email,
                           @RequestParam String code,
                           @RequestParam String officer,
                           @RequestParam String jurisdiction,
                           Model model){
        System.out.println("onSubmit Police StationController");

        model.addAttribute("stationName", stationName);
        model.addAttribute("location", location);
        model.addAttribute("city", city);
        model.addAttribute("pincode", pincode);
        model.addAttribute("state", state);
        model.addAttribute("phone", phone);
        model.addAttribute("email", email);
        model.addAttribute("code", code);
        model.addAttribute("officer", officer);
        model.addAttribute("jurisdiction", jurisdiction);

        System.out.println("StationName: " + stationName +
                ", Location: " + location + ", city: "
                + city + ", Pincode: " + pincode + ", State: " +
                state + ", Phone: " + phone+ ", Email: " + email +
                ", Code: " + code + ", Officer: " + officer +
                ", Jurisdiction: " + jurisdiction);
        return "result.jsp";
    }
}
