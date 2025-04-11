package com.mirror;

public class DigitalMirror extends Mirror{
    public DigitalMirror() {
        System.out.println("no-arg constructor of SmartLight");
    }

    @Override
    public void reflect() {
        System.out.println("Running overridden switchOn() in SmartLight");
    }

    void connectToApp() {
        System.out.println("Running connectToApp() in SmartLight");
    }
}
