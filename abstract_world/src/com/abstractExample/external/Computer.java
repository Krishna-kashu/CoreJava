package com.abstractExample.external;

import com.abstractExample.internal.Device;

public abstract class Computer extends Device {
    @Override
    public void turnOn() {
        System.out.println("Running turnOn in Computer");
    }
}
