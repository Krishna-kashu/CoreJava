package com.oopworkz.runner;
import com.oopworkz.setter.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {

        Bicycle b1 = new Bicycle();
        b1.setBrand("Trek");
        b1.setGearCount(21);
        b1.setElectric(true);
        b1.setPrice(1200);

        Bicycle b2 = new Bicycle();
        b2.setBrand("Giant");
        b2.setGearCount(18);
        b2.setElectric(false);
        b2.setPrice(800);

        Bicycle b3 = new Bicycle();
        b3.setBrand("Giant");
        b3.setGearCount(18);
        b3.setElectric(false);
        b3.setPrice(800);

        System.out.println("Bicycle 1: " + b1);
        System.out.println("Bicycle 2: " + b2);
        System.out.println("Bicycle 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Bicycle match: " + bMatch);
        System.out.println("Bicycle not match: " + bNotMatch);
    }
}