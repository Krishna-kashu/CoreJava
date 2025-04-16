package com.hydration;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        bottle.pour();

        Bottle bottle1 = new SmartBottle();
        bottle1.pour();

        System.out.println("**********");

        SmartBottle smartBottle = new SmartBottle();
        smartBottle.pour();
        smartBottle.trackIntake();

        Bottle bottle2 = new Bottle(750, "Steel");
        Bottle bottle3 = new Bottle(bottle2);
        System.out.println(bottle3);
    }
}
