package com.oopworkz.runner;
import com.oopworkz.setter.Refrigerator;

public class RefrigeratorRunner {
    public static void main(String[] args) {
        Refrigerator r1 = new Refrigerator();
        r1.setVolumeLiters(300);
        r1.setHasFreezer(true);
        r1.setBrand("LG");
        r1.setEnergyRating("A++");

        Refrigerator r2 = new Refrigerator();
        r2.setVolumeLiters(250);
        r2.setHasFreezer(false);
        r2.setBrand("Samsung");
        r2.setEnergyRating("A+");

        Refrigerator r3 = new Refrigerator();
        r3.setVolumeLiters(250);
        r3.setHasFreezer(false);
        r3.setBrand("Samsung");
        r3.setEnergyRating("A+");

        System.out.println("Refrigerator 1: " + r1);
        System.out.println("Refrigerator 2: " + r2);
        System.out.println("Refrigerator 3: " + r3);

        boolean rMatch = r2.equals(r3);
        boolean rNotMatch = r1.equals(r2);
        System.out.println("Refrigerator match: " + rMatch);
        System.out.println("Refrigerator not match: " + rNotMatch);
    }
}
