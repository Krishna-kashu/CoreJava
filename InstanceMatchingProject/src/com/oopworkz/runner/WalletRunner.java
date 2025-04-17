package com.oopworkz.runner;
import com.oopworkz.setter.Wallet;

public class WalletRunner {
    public static void main(String[] args) {
        Wallet w1 = new Wallet();
        w1.setMaterial("Leather");
        w1.setCapacity(8);
        w1.setHasZipper(true);
        w1.setColor("Brown");

        Wallet w2 = new Wallet();
        w2.setMaterial("Canvas");
        w2.setCapacity(6);
        w2.setHasZipper(false);
        w2.setColor("Black");

        Wallet w3 = new Wallet();
        w3.setMaterial("Canvas");
        w3.setCapacity(6);
        w3.setHasZipper(false);
        w3.setColor("Black");

        System.out.println("Wallet 1: " + w1);
        System.out.println("Wallet 2: " + w2);
        System.out.println("Wallet 3: " + w3);

        boolean wMatch = w2.equals(w3);
        boolean wNotMatch = w1.equals(w2);
        System.out.println("Wallet match: " + wMatch);
        System.out.println("Wallet not match: " + wNotMatch);
    }
}
