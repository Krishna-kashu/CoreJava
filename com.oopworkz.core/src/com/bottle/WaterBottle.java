package com.bottle;

public class WaterBottle extends Bottle {
    public WaterBottle() {
        System.out.println("no-arg constructor of WaterBottle");
    }

    @Override
    public void open() {
        System.out.println("Running overridden open() in WaterBottle");
    }

    void refill() {
        System.out.println("Running refill() in WaterBottle");
    }
}
