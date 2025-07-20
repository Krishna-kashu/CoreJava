package com.mywork.elasticspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mywork.elasticspring.component")
public class SpringConfiguration {
    public SpringConfiguration() {
        System.out.println("created SpringConfiguration...");
    }

    @Bean
    public String stringRegister(){
        System.out.println("StringRegister");
    return "Hey";
    }

    @Bean
    public String string1() {
        System.out.println("String 1");
        return "Spring Boot";
    }

    @Bean
    public String string2() {
        System.out.println("String 2");
        return "Java";
    }

    @Bean
    public String string3() {
        System.out.println("String 3");
        return "Hibernate";
    }

    @Bean
    public String string4() {
        System.out.println("String 4");
        return "Spring MVC";
    }

    @Bean
    public String string5() {
        System.out.println("String 5");
        return "Servlet";
    }
    @Bean
    public Object object1() {
        System.out.println("Object 1");
        return new Object();
    }

    @Bean
    public Object object2() {
        System.out.println("Object 2");
        return new Object();
    }

    @Bean
    public Object object3() {
        System.out.println("Object 3");
        return new Object();
    }

    @Bean
    public Object object4() {
        System.out.println("Object 4");
        return new Object();
    }

    @Bean
    public Object object5() {
        System.out.println("Object 5");
        return new Object();
    }
    @Bean
    public Integer integer1(){
        System.out.println("Integer 1");
        return 5;
    }

    @Bean
    public Integer integer2(){
        System.out.println("Integer 2");
        return 57;
    }

    @Bean
    public Double DoubleBean1(){
        System.out.println("Double 1");
        return 67845.6;
    }

    @Bean
    public Double DoubleBean2(){
        System.out.println("Double 2");
        return 536782.5;
    }

    @Bean
    public Float floatBean1() {
        System.out.println("Float 1");
        return 1.2f;
    }

    @Bean
    Float floatBean2() {
        System.out.println("Float 2");
        return 2.4f;
    }

    @Bean
    public Long longBean1() {
        System.out.println("Long 1");
        return 100L;
    }

    @Bean
    public Long longBean2() {
        System.out.println("Long 2");
        return 200L;
    }

    @Bean
    public Short shortBean1() {
        System.out.println("Short 1");
        return 1;
    }

    @Bean
    public Short shortBean2() {
        System.out.println("Short 2");
        return 2;
    }

    @Bean
    public Byte byteBean1() {
        System.out.println("Byte 1");
        return 3;
    }

    @Bean
    public Byte byteBean2() {
        System.out.println("Byte 2");
        return 4;
    }

    @Bean
    public Boolean booleanBean1() {
        System.out.println("Boolean 1");
        return true;
    }

    @Bean
    public Boolean booleanBean2() {
        System.out.println("Boolean 2");
        return false;
    }

    @Bean
    public Character charBean1() {
        System.out.println("Character 1");
        return 'A';
    }

    @Bean
    public Character charBean2() {
        System.out.println("Character 2");
        return 'B';
    }


    @Bean
    public String[] nameArrayBean() {
        System.out.println("String[]  1");
        return new String[]{"Amar", "Charan", "Harsh", "Diya", "Sara"};
    }

    @Bean
    public  String[] newNames(){
        System.out.println("String[]  2");
        return new String[]{"Shama", "Swathi", "Farina", "Tarak"};
    }

    @Bean
    public Integer[] array(int day){
        return new Integer[]{3, 4, 6};
    }
}