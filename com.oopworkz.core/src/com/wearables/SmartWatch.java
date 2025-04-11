package com.wearables;

public class SmartWatch extends Watch {
    public SmartWatch() {
        System.out.println("Constructor of SmartWatch");
    }

    @Override
    public void showTime() {
        System.out.println("Showing digital time and steps");
    }

    public void trackSteps() {
        System.out.println("Tracking steps on SmartWatch");
    }
}