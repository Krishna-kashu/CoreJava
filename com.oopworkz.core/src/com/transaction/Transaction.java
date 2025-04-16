package com.transaction;

public class Transaction {
    private double amount;
    private String transactionId;
    public Transaction() {
        System.out.println("no-arg constructor of Transaction");
    }

    public void execute() {
        System.out.println("Running execute() in Transaction");
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Transaction(Transaction ref) {
        this.amount = ref.amount;
        this.transactionId = ref.transactionId;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Amount: ₹" + amount;
    }

}
