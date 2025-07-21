package com.mywork.elasticspring.controller;

public class FirstController {
    public FirstController(){
        System.out.println("Calling first controller by spring container(ApplicationContext)");
    }

    public String onSend(){

        return "/index.jsp";
    }
}
