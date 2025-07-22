package com.mywork.elasticspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class FirstController {

    @RequestMapping("/")
    public String load(){
        System.out.println("loading index");
        return "index";
    }
    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public String onSend() {
        System.out.println("Send button clicked");
        return "index";
    }
}
