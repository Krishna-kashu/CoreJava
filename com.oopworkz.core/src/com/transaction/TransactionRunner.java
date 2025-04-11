package com.transaction;

public class TransactionRunner {
    public static void main(String[] args) {
        Transaction tx = new Transaction();
        tx.execute();

        Transaction tx1 = new OnlineTransaction();
        tx1.execute();

        System.out.println("**********");

        OnlineTransaction onlineTx = new OnlineTransaction();
        onlineTx.execute();
        onlineTx.verifyOTP();
    }
}
