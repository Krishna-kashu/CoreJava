package com.oopsworkz.impl;

import com.oopsworkz.internal.Charger;

public class PhoneCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("Running charge in PhoneCharger");
    }
}
