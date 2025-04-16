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
        Bottle bottle1 = new Bottle(1000, "Plastic");
        Bottle bottle2 = new Bottle(bottle1);
        System.out.println(bottle2);
    }
}
