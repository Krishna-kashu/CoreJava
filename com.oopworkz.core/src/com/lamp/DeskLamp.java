package com.lamp;

public class DeskLamp extends Lamp {
    public DeskLamp() {
        System.out.println("no-arg constructor of DeskLamp");
    }

    @Override
    public void turnOn() {
        System.out.println("Running overridden turnOn() in DeskLamp");
    }

    void adjustBrightness() {
        System.out.println("Running adjustBrightness() in DeskLamp");
    }
}
