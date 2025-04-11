package com.light;

public class SmartLight extends Light {
    public SmartLight() {
        System.out.println("no-arg constructor of SmartLight");
    }

    @Override
    public void switchOn() {
        System.out.println("Running overridden switchOn() in SmartLight");
    }

    void connectToApp() {
        System.out.println("Running connectToApp() in SmartLight");
    }
}
