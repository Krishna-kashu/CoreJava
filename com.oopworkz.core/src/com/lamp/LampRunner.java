package com.lamp;

public class LampRunner {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.turnOn();

        Lamp lamp1 = new DeskLamp();
        lamp1.turnOn();

        System.out.println("**********");

        DeskLamp desk = new DeskLamp();
        desk.turnOn();
        desk.adjustBrightness();

        Lamp lamp2 = new Lamp();
        lamp2.setType("LED");
        lamp2.setWattage(15);

        Lamp lamp3 = new Lamp(lamp2);
        System.out.println(lamp3);
    }
}
