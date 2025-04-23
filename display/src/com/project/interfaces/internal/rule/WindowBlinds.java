package com.project.interfaces.internal.rule;

public interface WindowBlinds {

    void open();
    void close();
    void tiltUp();
    void tiltDown();
    void lockPosition();
    void unlockPosition();
    void setTimer();
    void reset();
    void calibrate();
}