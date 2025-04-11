package com.school;

public class SmartBoard extends Board {
    public SmartBoard() {
        System.out.println("Constructor of SmartBoard");
    }

    @Override
    public void write() {
        System.out.println("Writing digitally on SmartBoard");
    }

    public void connectToWifi() {
        System.out.println("SmartBoard connected to Wi-Fi");
    }
}
