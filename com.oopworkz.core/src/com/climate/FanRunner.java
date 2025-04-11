package com.climate;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.rotate();

        Fan fan1 = new CeilingFan();
        fan1.rotate();

        System.out.println("**********");

        CeilingFan ceilingFan = new CeilingFan();
        ceilingFan.rotate();
        ceilingFan.changeSpeed();
    }
}
