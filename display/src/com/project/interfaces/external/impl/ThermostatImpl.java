package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.Thermostat;

public class ThermostatImpl implements Thermostat {
    @Override
    public void increaseTemperature() {
        System.out.println("Running increaseTemperature in ThermostatImpl");
    }

    @Override
    public void decreaseTemperature() {
        System.out.println("Running decreaseTemperature in ThermostatImpl");
    }

    @Override
    public void setSchedule() {
        System.out.println("Running setSchedule in ThermostatImpl");
    }

    @Override
    public void showCurrentTemp() {
        System.out.println("Running showCurrentTemp in ThermostatImpl");
    }

    @Override
    public void turnOff() {
        System.out.println("Running turnOff in ThermostatImpl");
    }
}
