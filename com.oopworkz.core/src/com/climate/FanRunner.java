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

        Fan fan2 = new Fan(3, "Black");
        Fan fan3 = new Fan(fan2);
        System.out.println(fan3);

    }
}
