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
        Microwave micro1 = new Microwave();
        micro1.setPowerWatts(900);
        micro1.setBrand("LG");

        Microwave micro2 = new Microwave(micro1);
        System.out.println(micro2);

    }
}
