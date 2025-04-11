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
    }
}
