package com.thermocup;

public class CupRunner {
    public static void main(String[] args) {
        Cup c = new Cup();
        c.fill();

        Cup c1 = new ThermoCup();
        c1.fill();

        System.out.println("**********");

        ThermoCup tc = new ThermoCup();
        tc.fill();
        tc.maintainTemperature();

        Cup cup1 = new Cup();
        cup1.setColor("Blue");
        cup1.setVolume(250.0);

        Cup cup2 = new Cup(cup1);
        System.out.println(cup2);

    }
}
