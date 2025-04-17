package com.oopworkz.runner;
import com.oopworkz.constructor.WaterPurifier;

public class WaterPurifierRunner {
    public static void main(String[] args) {

        WaterPurifier w1 = new WaterPurifier("RO", 10.5, true, "Kent");
        WaterPurifier w2 = new WaterPurifier("UF", 15.0, false, "Aquaguard");
        WaterPurifier w3 = new WaterPurifier("UF", 15.0, false, "Aquaguard");

        System.out.println("WaterPurifier 1: " + w1);
        System.out.println("WaterPurifier 2: " + w2);
        System.out.println("WaterPurifier 3: " + w3);

        boolean wMatch = w2.equals(w3);
        boolean wNotMatch = w1.equals(w2);
        System.out.println("WaterPurifier match: " + wMatch);
        System.out.println("WaterPurifier not match: " + wNotMatch);
    }
}
