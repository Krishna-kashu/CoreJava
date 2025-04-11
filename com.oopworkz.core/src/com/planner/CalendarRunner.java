package com.planner;

public class CalendarRunner {
    public static void main(String[] args) {
        Calendar cal = new Calendar();
        cal.showDate();

        Calendar cal1 = new DigitalCalendar();
        cal1.showDate();

        System.out.println("**********");

        DigitalCalendar digital = new DigitalCalendar();
        digital.showDate();
        digital.syncEvents();
    }
}
