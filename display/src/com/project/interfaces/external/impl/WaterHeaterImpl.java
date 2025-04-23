package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.WaterHeater;

public class WaterHeaterImpl implements WaterHeater
{
    @Override public void turnOn() {
        System.out.println("Running turnOn in WaterHeaterImpl");
    }
    @Override
    public void turnOff() {
        System.out.println("Running turnOff in WaterHeaterImpl");
    }

    @Override
    public void setTemperature() {
        System.out.println("Running setTemperature in WaterHeaterImpl");
    }

    @Override
    public void increaseTemperature() {
        System.out.println("Running increaseTemperature in WaterHeaterImpl");
    }

    @Override
    public void decreaseTemperature() {
        System.out.println("Running decreaseTemperature in WaterHeaterImpl");
    }

    @Override
    public void checkWaterLevel() {
        System.out.println("Running checkWaterLevel in WaterHeaterImpl");
    }

    @Override
    public void startHeating() {
        System.out.println("Running startHeating in WaterHeaterImpl");
    }

    @Override
    public void stopHeating() {
        System.out.println("Running stopHeating in WaterHeaterImpl");
    }

    @Override
    public void selfClean() {
        System.out.println("Running selfClean in WaterHeaterImpl");
    }


}