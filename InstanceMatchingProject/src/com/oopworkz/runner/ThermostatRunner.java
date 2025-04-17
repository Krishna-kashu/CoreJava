package com.oopworkz.runner;
import com.oopworkz.constructor.Thermostat;

public class ThermostatRunner {
    public static void main(String[] args) {

        Thermostat t1 = new Thermostat("15-30°C", "Nest", true, "White");
        Thermostat t2 = new Thermostat("20-25°C", "Honeywell", false, "Black");
        Thermostat t3 = new Thermostat("20-25°C", "Honeywell", false, "Black");

        System.out.println("Thermostat 1: " + t1);
        System.out.println("Thermostat 2: " + t2);
        System.out.println("Thermostat 3: " + t3);

        boolean tMatch = t2.equals(t3);
        boolean tNotMatch = t1.equals(t2);
        System.out.println("Thermostat match: " + tMatch);
        System.out.println("Thermostat not match: " + tNotMatch);
    }
}
