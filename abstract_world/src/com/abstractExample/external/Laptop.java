package com.abstractExample.external;
public class Laptop extends Computer {
    @Override
    public void turnOn() {
        System.out.println(" turning on i n  Laptop");
    }

    @Override
    public void turnOff() {
        System.out.println(" turning off in Laptop");
    }
}
