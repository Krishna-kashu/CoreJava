package com.mywork.elasticspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FirstController {
    public FirstController(){
        System.out.println("Calling first controller by spring container(ApplicationContext)");
    }

    @RequestMapping(value = "/send")
    public String onSend(){
        System.out.println("running onSend after clicking send");
        return "/index.jsp";
    }
}
