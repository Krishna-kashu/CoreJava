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
    }
}
