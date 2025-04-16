package com.locker;

public class LockerRunner {
    public static void main(String[] args) {
        Locker l = new Locker();
        l.lock();

        Locker l1 = new DigitalLocker();
        l1.lock();

        System.out.println("**********");

        DigitalLocker dl = new DigitalLocker();
        dl.lock();
        dl.encrypt();
        Locker locker1 = new Locker();
        locker1.setMaterial("Steel");
        locker1.setLockerNumber(101);

        Locker locker2 = new Locker(locker1);
        System.out.println(locker2);
    }
}
