package com.container;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle b = new Bottle();
        b.fill();

        Bottle b1 = new ThermoBottle();
        b1.fill();

        System.out.println("**********");

        ThermoBottle tb = new ThermoBottle();
        tb.fill();
        tb.maintainTemperature();
    }
}
