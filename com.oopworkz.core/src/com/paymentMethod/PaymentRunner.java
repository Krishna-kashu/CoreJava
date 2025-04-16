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

        PaymentMethod pay1 = new PaymentMethod();
        pay1.setType("Credit Card");
        pay1.setIsActive(true);

        PaymentMethod pay2 = new PaymentMethod(pay1);
        System.out.println(pay2);

    }
}
