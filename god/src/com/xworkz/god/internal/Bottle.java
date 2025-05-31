package com.xworkz.god.internal;

public class Bottle {
    public Bottle(){
        System.out.println("No arg const of Bottle");
    }
    public void open(){
        System.out.println("Running open in Bottle... ");
        Perfume perfume= new Perfume();
        perfume.spray();
        perfume.testFragrance();
        }
    }
