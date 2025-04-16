package com.paymentMethod;

public class PaymentMethod {
    private String type;
    private boolean isActive;
        public PaymentMethod() {
            System.out.println("no-arg constructor of PaymentMethod");
        }

        public void processPayment() {
            System.out.println("Running processPayment() in PaymentMethod");
        }

    public void setType(String type) {
        this.type = type;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public PaymentMethod(PaymentMethod ref) {
        this.type = ref.type;
        this.isActive = ref.isActive;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Active: " + isActive;
    }

}
