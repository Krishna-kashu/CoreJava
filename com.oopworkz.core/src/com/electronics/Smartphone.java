package com.electronics;

public class Smartphone extends Device {
    public Smartphone() {
        System.out.println("Smartphone constructor called");
    }

    @Override
    public void start() {
        System.out.println("Booting up the smartphone");
    }

    public void makeCall() {
        System.out.println("Making a phone call");
    }
}
