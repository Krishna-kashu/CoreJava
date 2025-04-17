package com.oopworkz.runner;
import com.oopworkz.constructor.SmartLock;

public class SmartLockRunner {
    public static void main(String[] args) {

        SmartLock s1 = new SmartLock(100, true, "August", "Silver");
        SmartLock s2 = new SmartLock(200, false, "Yale", "Black");
        SmartLock s3 = new SmartLock(200, false, "Yale", "Black");

        System.out.println("SmartLock 1: " + s1);
        System.out.println("SmartLock 2: " + s2);
        System.out.println("SmartLock 3: " + s3);

        boolean sMatch = s2.equals(s3);
        boolean sNotMatch = s1.equals(s2);
        System.out.println("SmartLock match: " + sMatch);
        System.out.println("SmartLock not match: " + sNotMatch);
    }
}
