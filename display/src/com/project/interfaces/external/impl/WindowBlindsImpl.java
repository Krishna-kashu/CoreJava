package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.WindowBlinds;

public class WindowBlindsImpl implements WindowBlinds {
    @Override
    public void open() {
        System.out.println("Running open in WindowBlindsImpl");
    }
    @Override
    public void close() {
        System.out.println("Running close in WindowBlindsImpl");
    }
    @Override
    public void tiltUp() {
        System.out.println("Running tiltUp in WindowBlindsImpl");
    }
    @Override
    public void tiltDown() {
        System.out.println("Running tiltDown in WindowBlindsImpl");
    }
    @Override
    public void lockPosition() {
        System.out.println("Running lockPosition in WindowBlindsImpl");
    }
    @Override
    public void unlockPosition() {
        System.out.println("Running unlockPosition in WindowBlindsImpl");
    }
    @Override
    public void setTimer() {
        System.out.println("Running setTimer in WindowBlindsImpl");
    }
    @Override
    public void reset() {
        System.out.println("Running reset in WindowBlindsImpl");
    }
    @Override
    public void calibrate() {
        System.out.println("Running calibrate in WindowBlindsImpl");
    }
}