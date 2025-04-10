package com.paymentMethod;

public class PaymentRunner {
    public static void main(String[] args) {
        PaymentMethod pm = new PaymentMethod();
        pm.processPayment();

        PaymentMethod pm1 = new CreditCard();
        pm1.processPayment();

        System.out.println("**********");

        CreditCard creditCard = new CreditCard();
        creditCard.processPayment();
        creditCard.validateCard();
    }
}
