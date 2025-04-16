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
        Watch watch = new Watch();
        watch.setBrand("Fossil");
        watch.setSmartWatch(true);

        Watch watch1 = new Watch(watch);
        System.out.println(watch1);

    }
}
