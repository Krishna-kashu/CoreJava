package com.oopsworkz.impl;

import com.oopsworkz.internal.PaymentApp;

public class PhonePe implements PaymentApp {
    @Override
    public void pay() {
        System.out.println("Running pay in PhonePe");
    }
}
