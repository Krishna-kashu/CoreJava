package com.control;

public class SmartRemote extends Remote {
    public SmartRemote() {
        System.out.println("no-arg constructor of SmartRemote");
    }

    @Override
    public void pressButton() {
        System.out.println("Running overridden pressButton() in SmartRemote");
    }

    void voiceControl() {
        System.out.println("Running voiceControl() in SmartRemote");
    }
}
