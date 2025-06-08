package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.EmailService;

public class EmailRunner {
    public static void main(String[] args) {
        new EmailService().validateEmail("john@gmail.com");
        new EmailService().validateEmail("john@abc.com");
    }
}
