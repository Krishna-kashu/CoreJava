package com.oopsworkz.impl;

import com.oopsworkz.internal.Charger;

public class LaptopCharger implements Charger {
    public  LaptopCharger(){
        System.out.println("no-arg Constructor of Laptop charger");
    }
    @Override
    public void charge() {
        System.out.println("Running charge in laptopCharger");
    }
}
