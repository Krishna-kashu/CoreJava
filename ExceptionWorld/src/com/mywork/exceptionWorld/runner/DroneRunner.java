package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.exception.LowBatteryException;
import com.mywork.exceptionWorld.service.DroneService;

public class DroneRunner {
    public static void main(String[] args) {
        try {
            new DroneService().checkBattery(5);
        } catch (LowBatteryException e) {
            System.out.println(e.getMessage());
        }
    }
}
