package com.microwave;

public class MicrowaveRunner {
    public static void main(String[] args) {
        Microwave mw = new Microwave();
        mw.heat();

        Microwave mw1 = new SmartMicrowave();
        mw1.heat();

        System.out.println("**********");

        SmartMicrowave smart = new SmartMicrowave();
        smart.heat();
        smart.connectWiFi();
    }
}
