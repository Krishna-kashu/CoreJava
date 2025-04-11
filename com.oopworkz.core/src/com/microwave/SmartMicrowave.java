package com.microwave;

public class SmartMicrowave extends Microwave {
    public SmartMicrowave() {
        System.out.println("no-arg constructor of SmartMicrowave");
    }

    @Override
    public void heat() {
        System.out.println("Running overridden heat() in SmartMicrowave");
    }

    void connectWiFi() {
        System.out.println("Running connectWiFi() in SmartMicrowave");
    }
}
