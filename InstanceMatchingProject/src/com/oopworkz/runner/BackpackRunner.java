package com.oopworkz.runner;
import com.oopworkz.setter.Backpack;

public class BackpackRunner {
    public static void main(String[] args) {
        Backpack b1 = new Backpack();
        b1.setVolume(20.0);
        b1.setCompartments(3);
        b1.setWaterproof(true);
        b1.setBrand("North Face");

        Backpack b2 = new Backpack();
        b2.setVolume(15.5);
        b2.setCompartments(2);
        b2.setWaterproof(false);
        b2.setBrand("JanSport");

        Backpack b3 = new Backpack();
        b3.setVolume(15.5);
        b3.setCompartments(2);
        b3.setWaterproof(false);
        b3.setBrand("JanSport");

        System.out.println("Backpack 1: " + b1);
        System.out.println("Backpack 2: " + b2);
        System.out.println("Backpack 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Backpack match: " + bMatch);
        System.out.println("Backpack not match: " + bNotMatch);
    }
}
