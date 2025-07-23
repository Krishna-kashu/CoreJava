package com.myworks.greendress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class NameController {
    public NameController(){
        System.out.println("no arg constructor of NameController");
    }
    @RequestMapping("/submit")
    public String onSubmit(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String middlename, @RequestParam String displayname, Model model) {
        System.out.println("Name added");

        model.addAttribute("fname", firstname);
        model.addAttribute("lname", lastname);
        model.addAttribute("mname", middlename);
        model.addAttribute("dname", displayname);

        System.out.println("First name: "+firstname+ "  Last name: "+lastname +"  Middle name: "+middlename + "\tDisplay name: "+displayname);
        return "result.jsp";
    }
}
