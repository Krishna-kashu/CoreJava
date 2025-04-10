package com.banktransaction;

public class WithdrawalTransaction extends BankTransaction {
    public WithdrawalTransaction() {
        System.out.println("no-arg constructor of WithdrawalTransaction");
    }
    @Override
    public void execute() {
        System.out.println("Running overridden execute() in WithdrawalTransaction");
    }

    void confirmPIN() {
        System.out.println("Running confirmPIN() in WithdrawalTransaction");
    }
}

