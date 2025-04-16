package com.timekeeping;

public class ClockRunner {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.showTime();

        Clock clock1 = new AlarmClock();
        clock1.showTime();

        System.out.println("**********");

        AlarmClock alarm = new AlarmClock();
        alarm.showTime();
        alarm.setAlarm();
        Clock clk1 = new Clock();
        clk1.setModel("Casio Wave Ceptor");
        clk1.setBatteryOperated(true);

        Clock clk2 = new Clock(clk1);
        System.out.println(clk2);

    }
}
