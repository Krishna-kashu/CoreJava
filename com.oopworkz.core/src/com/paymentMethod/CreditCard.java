package com.paymentMethod;

public class CreditCard extends PaymentMethod {
    public CreditCard() {
        System.out.println("no-arg constructor of CreditCardPayment");
    }

    @Override
    public void processPayment() {
        System.out.println("Running overridden processPayment() in CreditCardPayment");
    }

    void validateCard() {
        System.out.println("Running validateCard() in CreditCardPayment");
    }
}
