package com.container;

public class ThermoBottle  extends Bottle {
    public ThermoBottle() {
        System.out.println("no-arg constructor of ThermoBottle");
    }

    @Override
    public void fill() {
        System.out.println("Running overridden fill() in ThermoBottle");
    }

    void maintainTemperature() {
        System.out.println("Running maintainTemperature() in ThermoBottle");
    }
}