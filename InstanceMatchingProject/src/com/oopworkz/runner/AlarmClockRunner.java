package com.oopworkz.runner;
import com.oopworkz.setter.AlarmClock;

public class AlarmClockRunner {
    public static void main(String[] args) {
        AlarmClock a1 = new AlarmClock();
        a1.setDigital(true);
        a1.setAlarmTone("Beep");
        a1.setSnoozeDuration(5);
        a1.setBrand("Philips");

        AlarmClock a2 = new AlarmClock();
        a2.setDigital(false);
        a2.setAlarmTone("Melody");
        a2.setSnoozeDuration(10);
        a2.setBrand("Seiko");

        AlarmClock a3 = new AlarmClock();
        a3.setDigital(false);
        a3.setAlarmTone("Melody");
        a3.setSnoozeDuration(10);
        a3.setBrand("Seiko");

        System.out.println("AlarmClock 1: " + a1);
        System.out.println("AlarmClock 2: " + a2);
        System.out.println("AlarmClock 3: " + a3);

        boolean aMatch = a2.equals(a3);
        boolean aNotMatch = a1.equals(a2);
        System.out.println("AlarmClock match: " + aMatch);
        System.out.println("AlarmClock not match: " + aNotMatch);
    }
}
