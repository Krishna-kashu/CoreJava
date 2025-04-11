package com.transaction;

public class Transaction {
    public Transaction() {
        System.out.println("no-arg constructor of Transaction");
    }

    public void execute() {
        System.out.println("Running execute() in Transaction");
    }
}
