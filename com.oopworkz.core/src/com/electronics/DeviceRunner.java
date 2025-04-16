package com.electronics;

public class DeviceRunner {
    public static void main(String[] args) {
        Device d = new Device();
        d.start();

        Device d1 = new Smartphone();
        d1.start();

        System.out.println("**********");

        Smartphone s = new Smartphone();
        s.start();
        s.makeCall();
        Device device1 = new Device("iPhone 14", 20);
        Device device2 = new Device(device1);
        System.out.println(device2);

    }
}
