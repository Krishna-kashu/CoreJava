package com.organizer;

public class CalendarRunner {
    public static void main(String[] args) {
        Calendar c = new Calendar();
        c.displayDate();

        Calendar c1 = new DigitalCalendar();
        c1.displayDate();

        System.out.println("**********");

        DigitalCalendar dc = new DigitalCalendar();
        dc.displayDate();
        dc.addEvent();
    }
}
