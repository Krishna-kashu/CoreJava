package com.account;

public class SavingsAccount extends Account {
    public SavingsAccount() {
        System.out.println("no-arg constructor of SavingsAccount");
    }

    @Override
    public void deposit() {
        System.out.println("Running overridden deposit() in SavingsAccount");
    }

    void addInterest() {
        System.out.println("Running addInterest() in SavingsAccount");
    }
}