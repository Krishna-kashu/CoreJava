package com.mywork.exceptionWorld.service;

import com.mywork.exceptionWorld.exception.LowBatteryException;

public class DroneService {
    public void checkBattery(int level) throws LowBatteryException {
        if (level < 10)
            throw new LowBatteryException("Battery critically low: " + level + "%");
        else
            System.out.println("Battery level: " + level + "%");
    }
}
