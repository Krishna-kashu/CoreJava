package com.mywork.elasticspring.controller;

import org.springframework.stereotype.Controller;

@Controller
public class FirstController {
    public FirstController(){
        System.out.println("Calling first controller by spring container(ApplicationContext)");
    }

    public String onSend(){
        System.out.println("running onSend after clicking send");
        return "/index.jsp";
    }
}
