package com.account;

public class Account {
    private int accountId;
    private String accountHolder;
        public Account() {
            System.out.println("no-arg constructor of Account");
        }
    public Account(int accountId, String accountHolder) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        System.out.println("int, String constructor of Account");
    }

    public Account(Account account) {
        this.accountId = account.accountId;
        this.accountHolder = account.accountHolder;
    }

    @Override
    public String toString() {
        return "Account ID: " + accountId + ", Account Holder: " + accountHolder;
    }
        public void deposit() {
            System.out.println("Running deposit() in Account");
        }
    }

