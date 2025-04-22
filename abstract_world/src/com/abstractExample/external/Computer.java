package com.abstractExample.external;

import com.abstractExample.internal.Device;

public class Computer extends Device {
    @Override
    public void turnOn() {
        System.out.println("running turnOn in Computer");
    }

    @Override
    public void turnOff() {
        System.out.println("running turnOff in Computer");
    }
}
