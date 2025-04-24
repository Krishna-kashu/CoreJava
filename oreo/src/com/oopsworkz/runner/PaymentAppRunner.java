package com.oopsworkz.runner;

import com.oopsworkz.impl.GooglePay;
import com.oopsworkz.impl.PhonePe;
import com.oopsworkz.internal.PaymentApp;
import com.oopsworkz.other.OnlineRecharge;

public class PaymentAppRunner {
    public static void main(String[] args) {
        PaymentApp paymentApp=new PhonePe();
        paymentApp.pay();

        PaymentApp paymentApp1=new GooglePay();
        paymentApp1.pay();

        OnlineRecharge onlineRecharge=new OnlineRecharge(paymentApp);
        onlineRecharge.enterPin();
        OnlineRecharge onlineRecharge1 =new OnlineRecharge(paymentApp1);
        onlineRecharge1.enterPin();

    }
}
