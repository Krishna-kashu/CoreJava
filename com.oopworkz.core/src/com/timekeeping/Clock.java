package com.timekeeping;

public class Clock {
    private String model;
    private boolean batteryOperated;
    public Clock() {
        System.out.println("no-arg constructor of Clock");
    }

    public void showTime() {
        System.out.println("Running showTime() in Clock");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBatteryOperated(boolean batteryOperated) {
        this.batteryOperated = batteryOperated;
    }

    public Clock(Clock ref) {
        this.model = ref.model;
        this.batteryOperated = ref.batteryOperated;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Battery Operated: " + batteryOperated;
    }

}
