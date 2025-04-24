package com.oopsworkz.impl;

import com.oopsworkz.internal.Charger;

public class LaptopCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("Running charge in laptopCharger");
    }
}
