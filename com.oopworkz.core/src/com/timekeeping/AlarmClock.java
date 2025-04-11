package com.timekeeping;

public class AlarmClock extends Clock {
    public AlarmClock() {
        System.out.println("no-arg constructor of AlarmClock");
    }

    @Override
    public void showTime() {
        System.out.println("Running overridden showTime() in AlarmClock");
    }

    void setAlarm() {
        System.out.println("Running setAlarm() in AlarmClock");
    }
}
