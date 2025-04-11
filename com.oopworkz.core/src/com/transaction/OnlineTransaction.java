package com.transaction;

public class OnlineTransaction extends Transaction {
    public OnlineTransaction() {
        System.out.println("no-arg constructor of OnlineTransaction");
    }

    @Override
    public void execute() {
        System.out.println("Running overridden execute() in OnlineTransaction");
    }

    void verifyOTP() {
        System.out.println("Running verifyOTP() in OnlineTransaction");
    }
}
