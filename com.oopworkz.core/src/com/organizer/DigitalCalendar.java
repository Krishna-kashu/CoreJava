package com.organizer;

public class DigitalCalendar extends Calendar {
    public DigitalCalendar() {
        System.out.println("Constructor of DigitalCalendar");
    }

    @Override
    public void displayDate() {
        System.out.println("Displaying digital calendar with events");
    }

    public void addEvent() {
        System.out.println("Event added to calendar");
    }
}