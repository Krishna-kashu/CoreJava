package com.abstractExample.internal;
public abstract class Device {
    public abstract void turnOn();
    public abstract void turnOff();

    public void plugIn() {
        System.out.println("Running plugin in Device ");
    }

    public void unplug() {
        System.out.println("Running unplug in Device ");
    }
}
