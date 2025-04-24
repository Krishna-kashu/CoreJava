package com.oopsworkz.other;

import com.oopsworkz.internal.PaymentApp;

public class OnlineRecharge {
    private PaymentApp paymentApp;

    public OnlineRecharge(PaymentApp paymentApp){
        this.paymentApp=paymentApp;
    }
    public  void enterPin(){
        System.out.println("Running enterPin in OnlineRecharge");
        if(paymentApp!=null){
            this.paymentApp.pay();
        }else{
            System.out.println("paymentApp obj is null");
        }
    }
}
