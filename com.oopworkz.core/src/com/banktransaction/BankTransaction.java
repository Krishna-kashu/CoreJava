package com.banktransaction;

public class BankTransaction {
    private String transactionId;
    private double amount;
        public BankTransaction() {
            System.out.println("no-arg constructor of BankTransaction");
        }

        public void execute() {
            System.out.println("Running execute() in BankTransaction");
        }

    public BankTransaction(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
        System.out.println("String, double constructor of BankTransaction");
    }

    public BankTransaction(BankTransaction bankTransaction) {
        this.transactionId = bankTransaction.transactionId;
        this.amount = bankTransaction.amount;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Amount: $" + amount;
    }
    }