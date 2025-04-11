package com.planner;

public class DigitalCalendar extends Calendar {
    public DigitalCalendar() {
        System.out.println("no-arg constructor of DigitalCalendar");
    }

    @Override
    public void showDate() {
        System.out.println("Running overridden showDate() in DigitalCalendar");
    }

    void syncEvents() {
        System.out.println("Running syncEvents() in DigitalCalendar");
    }
}
