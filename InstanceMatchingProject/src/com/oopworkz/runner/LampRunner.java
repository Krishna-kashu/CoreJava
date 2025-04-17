package com.oopworkz.runner;
import com.oopworkz.setter.Lamp;

public class LampRunner {
    public static void main(String[] args) {
        Lamp l1 = new Lamp();
        l1.setType("LED");
        l1.setWattage(9.5);
        l1.setColor("White");
        l1.setBrand("Philips");

        Lamp l2 = new Lamp();
        l2.setType("Incandescent");
        l2.setWattage(60.0);
        l2.setColor("Warm White");
        l2.setBrand("GE");

        Lamp l3 = new Lamp();
        l3.setType("Incandescent");
        l3.setWattage(60.0);
        l3.setColor("Warm White");
        l3.setBrand("GE");

        System.out.println("Lamp 1: " + l1);
        System.out.println("Lamp 2: " + l2);
        System.out.println("Lamp 3: " + l3);

        boolean lMatch = l2.equals(l3);
        boolean lNotMatch = l1.equals(l2);
        System.out.println("Lamp match: " + lMatch);
        System.out.println("Lamp not match: " + lNotMatch);
    }
}
