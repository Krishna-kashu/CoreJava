package com.fan;

public class FanRunner {
    public static void main(String[] args) {
        Device device = new Device();
        device.start();

        Device device1 = new Fan();
        device1.start();

        System.out.println("**********");

        Fan fan = new Fan();
        fan.start();
        fan.rotate();
        Device fanDevice1 = new Device("Usha", 1200);
        Device fanDevice2 = new Device(fanDevice1);
        System.out.println(fanDevice2);

    }
}