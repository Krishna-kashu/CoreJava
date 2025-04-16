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
        Transaction transaction = new Transaction();
        transaction.setAmount(5000.75);
        transaction.setTransactionId("TXN12345");

        Transaction transaction1 = new Transaction(transaction);
        System.out.println(transaction1);

    }
}
