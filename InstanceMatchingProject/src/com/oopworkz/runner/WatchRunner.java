package com.oopworkz.runner;
import com.oopworkz.setter.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch w1 = new Watch();
        w1.setDialShape("Round");
        w1.setWaterResistant(true);
        w1.setBrand("Rolex");
        w1.setPrice(15000);

        Watch w2 = new Watch();
        w2.setDialShape("Square");
        w2.setWaterResistant(false);
        w2.setBrand("Fossil");
        w2.setPrice(200);

        Watch w3 = new Watch();
        w3.setDialShape("Square");
        w3.setWaterResistant(false);
        w3.setBrand("Fossil");
        w3.setPrice(200);

        System.out.println("Watch 1: " + w1);
        System.out.println("Watch 2: " + w2);
        System.out.println("Watch 3: " + w3);

        boolean wMatch = w2.equals(w3);
        boolean wNotMatch = w1.equals(w2);
        System.out.println("Watch match: " + wMatch);
        System.out.println("Watch not match: " + wNotMatch);
    }
}
