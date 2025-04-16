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

        Calendar cal1 = new Calendar();
        cal1.setMonth("April");
        cal1.setYear(2025);

        Calendar cal2 = new Calendar(cal1);
        System.out.println(cal2);

    }
}
