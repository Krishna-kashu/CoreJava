package com.thermocup;

public class ThermoCup extends Cup {
    public ThermoCup() {
        System.out.println("Constructor of ThermoCup");
    }

    @Override
    public void fill() {
        System.out.println("Filling insulated thermo cup");
    }

    public void maintainTemperature() {
        System.out.println("Keeping drink hot/cold");
    }
}
