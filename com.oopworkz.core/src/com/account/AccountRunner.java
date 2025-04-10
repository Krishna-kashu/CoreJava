package com.account;

public class AccountRunner {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit();

        Account acc1 = new SavingsAccount();
        acc1.deposit();

        System.out.println("**********");

        SavingsAccount sa = new SavingsAccount();
        sa.deposit();
        sa.addInterest();
    }
}
