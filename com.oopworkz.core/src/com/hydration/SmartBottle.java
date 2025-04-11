package com.hydration;

public class SmartBottle extends Bottle {
    public SmartBottle() {
        System.out.println("Constructor of SmartBottle");
    }

    @Override
    public void pour() {
        System.out.println("Smart bottle detects how much was poured");
    }

    public void trackIntake() {
        System.out.println("Tracking water intake");
    }
}
