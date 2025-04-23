package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.SmartFan;

public class SmartFanImpl implements SmartFan {
    @Override
    public void turnOn() {
        System.out.println("Running turnOn in SmartFanImpl");
    }
    @Override
    public void turnOff() {
        System.out.println("Running turnOff in SmartFanImpl");
    }
    @Override
    public void setSpeed() {
        System.out.println("Running setSpeed in SmartFanImpl");
    }
    @Override
    public void increaseSpeed() {
        System.out.println("Running increaseSpeed in SmartFanImpl");
    }
    @Override
    public void decreaseSpeed() {
        System.out.println("Running decreaseSpeed in SmartFanImpl");
    }
    @Override
    public void rotateLeft() {
        System.out.println("Running rotateLeft in SmartFanImpl");
    }
    @Override
    public void rotateRight() {
        System.out.println("Running rotateRight in SmartFanImpl");
    }
    @Override
    public void enableTimer() {
        System.out.println("Running enableTimer in SmartFanImpl");
    }
    @Override
    public void disableTimer() {
        System.out.println("Running disableTimer in SmartFanImpl");
    }
}