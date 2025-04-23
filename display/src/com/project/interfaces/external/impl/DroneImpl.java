package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.Drone;

public class DroneImpl implements Drone {
    public void takeOff() {
        System.out.println("Running takeOff in DroneImpl");
    }

    @Override
    public void fly() {
        System.out.println("Running fly in DroneImpl");
    }

    @Override
    public void hover() {
        System.out.println("Running hover in DroneImpl");
    }

    @Override
    public void capturePhoto() {
        System.out.println("Running capturePhoto in DroneImpl");
    }

    @Override
    public void returnHome() {
        System.out.println("Running returnHome in DroneImpl");
    }

    @Override
    public void land() {
        System.out.println("Running land in DroneImpl");
    }

    @Override
    public void recharge() {
        System.out.println("Running recharge in DroneImpl");
    }
}
