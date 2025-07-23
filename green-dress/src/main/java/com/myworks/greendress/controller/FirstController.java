package com.myworks.greendress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FirstController {

    public FirstController(){
        System.out.println("no arg constructor of FirstController");
    }
    @RequestMapping("/send")
    public String onSend() {
        System.out.println("Send button clicked");
        return "index";
    }

}
