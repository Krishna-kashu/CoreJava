package com.appliance;

public class WashingMachine extends Appliance{
    public WashingMachine() {
        System.out.println("no-arg constructor of WashingMachine");
    }

    @Override
    public void turnOn() {
        System.out.println("Running overridden turnOn() in WashingMachine");
    }

    void startWashCycle() {
        System.out.println("Running startWashCycle() in WashingMachine");
    }
}
