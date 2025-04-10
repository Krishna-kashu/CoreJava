package com.sensor;

public class TemperatureSensor extends Sensor {
    public TemperatureSensor() {
        System.out.println("no-arg constructor of TemperatureSensor");
    }

    @Override
    public void readValue() {
        System.out.println("Running overridden readValue in TemperatureSensor");
    }

    void calibrateSensor() {
        System.out.println("Running calibrateSensor in TemperatureSensor");
    }
}