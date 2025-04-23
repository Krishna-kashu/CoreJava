package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.SmartDoorLock;

public class SmartDoorImpl implements SmartDoorLock {

    @Override
    public void lock() {
        System.out.println("Running lock in SmartDoorLockImpl");
    }

    @Override
    public void unlock() {
        System.out.println("Running unlock in SmartDoorLockImpl");
    }

    @Override
    public void setPasscode() {
        System.out.println("Running setPasscode in SmartDoorLockImpl");
    }

    @Override
    public void enableAutoLock() {
        System.out.println("Running enableAutoLock in SmartDoorLockImpl");
    }

    @Override
    public void disableAutoLock() {
        System.out.println("Running disableAutoLock in SmartDoorLockImpl");
    }

    @Override
    public void checkBattery() {
        System.out.println("Running checkBattery in SmartDoorLockImpl");
    }

    @Override
    public void factoryReset() {
        System.out.println("Running factoryReset in SmartDoorLockImpl");
    }
}
