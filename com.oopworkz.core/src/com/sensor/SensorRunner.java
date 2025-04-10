package com.sensor;

public class SensorRunner {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.readValue();

        Sensor sensor1 = new TemperatureSensor();
        sensor1.readValue();

        System.out.println("**********");

        TemperatureSensor temperatureSensor = new TemperatureSensor();
        temperatureSensor.readValue();
        temperatureSensor.calibrateSensor();
    }
}