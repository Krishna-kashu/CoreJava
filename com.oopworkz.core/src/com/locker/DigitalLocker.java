package com.locker;

public class DigitalLocker extends Locker {
    public DigitalLocker() {
        System.out.println("Constructor of DigitalLocker");
    }

    @Override
    public void lock() {
        System.out.println("Locking the digital locker with password");
    }

    public void encrypt() {
        System.out.println("Encrypting contents inside digital locker");
    }
}
