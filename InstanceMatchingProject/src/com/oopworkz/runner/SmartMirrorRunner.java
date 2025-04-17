package com.oopworkz.runner;
import com.oopworkz.constructor.SmartMirror;

public class SmartMirrorRunner {
    public static void main(String[] args) {

        SmartMirror sm1 = new SmartMirror(true, 32.0, "1080p", "LG");
        SmartMirror sm2 = new SmartMirror(false, 24.0, "720p", "Samsung");
        SmartMirror sm3 = new SmartMirror(false, 24.0, "720p", "Samsung");

        System.out.println("SmartMirror 1: " + sm1);
        System.out.println("SmartMirror 2: " + sm2);
        System.out.println("SmartMirror 3: " + sm3);

        boolean smMatch = sm2.equals(sm3);
        boolean smNotMatch = sm1.equals(sm2);
        System.out.println("SmartMirror match: " + smMatch);
        System.out.println("SmartMirror not match: " + smNotMatch);
    }
}
