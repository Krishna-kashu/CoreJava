package com.fan;

public class Fan extends Device {
    public Fan() {
        System.out.println("no-arg constructor of Fan");
    }

    @Override
    public void start() {
        System.out.println("Running overridden start() in Fan");
    }

    public void rotate() {
        System.out.println("Running rotate() in Fan");
    }

}
