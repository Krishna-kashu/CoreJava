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

        Sensor s1 = new Sensor();
        s1.setType("Motion");
        s1.setIsActive(true);
        Sensor s2 = new Sensor(s1);
        System.out.println(s2);

    }
}