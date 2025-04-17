package com.oopworkz.runner;
import com.oopworkz.setter.Joystick;

public class JoystickRunner {
    public static void main(String[] args) {
        Joystick j1 = new Joystick();
        j1.setBrand("Logitech");
        j1.setCost(3500);
        j1.setConnectivity("Wireless");
        j1.setButtons(12);

        Joystick j2 = new Joystick();
        j2.setBrand("Redgear");
        j2.setCost(2500);
        j2.setConnectivity("Wired");
        j2.setButtons(10);

        Joystick j3 = new Joystick();
        j3.setBrand("Redgear");
        j3.setCost(2500);
        j3.setConnectivity("Wired");
        j3.setButtons(10);

        System.out.println("Joystick 1: " + j1);
        System.out.println("Joystick 2: " + j2);
        System.out.println("Joystick 3: " + j3);

        boolean match = j2.equals(j3);
        boolean notMatch = j1.equals(j2);
        System.out.println("Joystick match: " + match);
        System.out.println("Joystick not match: " + notMatch);
    }
}
