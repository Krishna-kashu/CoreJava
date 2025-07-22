package com.myworks.greendress.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.myworks.greendress")
public class GreenDressConfiguration
{
    public GreenDressConfiguration(){
        System.out.println("no-arg constructor GreenDressConfiguration ");
    }
}
