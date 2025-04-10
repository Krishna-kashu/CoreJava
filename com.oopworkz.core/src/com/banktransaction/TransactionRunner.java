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
        }
    }
