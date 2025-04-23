package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.SmartMirror;

public class SmartMirrorImpl implements SmartMirror {
    @Override
    public void turnOn() {
        System.out.println("Running turnOn in SmartMirrorImpl");
    }

    @Override
    public void showTime() {
        System.out.println("Running showTime in SmartMirrorImpl");
    }

    @Override
    public void showWeather() {
        System.out.println("Running showWeather in SmartMirrorImpl");
    }
}
