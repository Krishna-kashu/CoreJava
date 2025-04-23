package com.project.interfaces.internal.rule;

public interface SmartDoorLock {
    void lock();
    void unlock();
    void setPasscode();
    void enableAutoLock();
    void disableAutoLock();
    void checkBattery();
    void factoryReset();
}
