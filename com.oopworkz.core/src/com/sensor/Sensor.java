package com.sensor;

public class Sensor {
    private String type;
    private boolean isActive;
    public Sensor() {
        System.out.println("no-arg constructor of Sensor");
    }

    public void readValue() {
        System.out.println("Running readValue() in Sensor");
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Sensor(Sensor ref) {
        this.type = ref.type;
        this.isActive = ref.isActive;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Active: " + isActive;
    }

}
