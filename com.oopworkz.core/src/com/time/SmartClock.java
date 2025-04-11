package com.time;

public class SmartClock extends Clock {
    public SmartClock() {
        System.out.println("Constructor of SmartClock");
    }

    @Override
    public void showTime() {
        System.out.println("Displaying digital time with weather");
    }
    public void setAlarm() {
        System.out.println("Alarm set in SmartClock");
    }
}
