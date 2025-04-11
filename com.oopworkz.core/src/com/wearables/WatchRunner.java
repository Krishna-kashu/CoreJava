package com.wearables;

public class WatchRunner {
    public static void main(String[] args) {
        Watch w = new Watch();
        w.showTime();

        Watch w1 = new SmartWatch();
        w1.showTime();

        System.out.println("**********");

        SmartWatch sw = new SmartWatch();
        sw.showTime();
        sw.trackSteps();
    }
}
