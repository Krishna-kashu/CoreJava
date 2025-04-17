package com.oopworkz.runner;
import com.oopworkz.constructor.AirPurifier;

public class AirPurifierRunner {
    public static void main(String[] args) {

        AirPurifier ap1 = new AirPurifier(15.5, "Dyson", true, "White");
        AirPurifier ap2 = new AirPurifier(20.0, "Xiaomi", true, "Black");
        AirPurifier ap3 = new AirPurifier(20.0, "Xiaomi", true, "Black");

        System.out.println("AirPurifier 1: " + ap1);
        System.out.println("AirPurifier 2: " + ap2);
        System.out.println("AirPurifier 3: " + ap3);

        boolean apMatch = ap2.equals(ap3);
        boolean apNotMatch = ap1.equals(ap2);
        System.out.println("AirPurifier match: " + apMatch);
        System.out.println("AirPurifier not match: " + apNotMatch);
    }
}
