package com.oopsworkz.impl;

import com.oopsworkz.internal.PaymentApp;

public class GooglePay implements PaymentApp {
    public GooglePay(){
        System.out.println("no-arg Constructor of Google Pay");
    }
    @Override
    public void pay() {
        System.out.println("Running pay in GooglePay");
    }
}
