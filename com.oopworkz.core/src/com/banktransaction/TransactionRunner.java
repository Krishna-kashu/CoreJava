package com.banktransaction;

public class TransactionRunner {
        public static void main(String[] args) {
            BankTransaction bt = new BankTransaction();
            bt.execute();

            BankTransaction bt1 = new WithdrawalTransaction();
            bt1.execute();

            System.out.println("**********");

            WithdrawalTransaction wt = new WithdrawalTransaction();
            wt.execute();
            wt.confirmPIN();

            BankTransaction bt2 = new BankTransaction("TXN123", 1500.0);
            BankTransaction bt3 = new BankTransaction(bt2);
            System.out.println(bt3);

        }
    }
