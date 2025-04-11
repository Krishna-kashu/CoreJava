package com.time;

public class ClockRunner {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.showTime();

        Clock c1 = new SmartClock();
        c1.showTime();

        System.out.println("**********");

        SmartClock sc = new SmartClock();
        sc.showTime();
        sc.setAlarm();
    }
}
