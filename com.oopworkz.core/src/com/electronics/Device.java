package com.electronics;

public class Device {
    private String deviceModel;
    private int batteryLife;
    public Device() {
        System.out.println("Device constructor called");
    }

    public void start() {
        System.out.println("Starting the device");
    }
    public Device(String deviceModel, int batteryLife) {
        this.deviceModel = deviceModel;
        this.batteryLife = batteryLife;
        System.out.println("String, int constructor of Device");
    }

    public Device(Device ref) {
        this.deviceModel = ref.deviceModel;
        this.batteryLife = ref.batteryLife;
    }

    @Override
    public String toString() {
        return "Device Model: " + deviceModel + ", Battery Life: " + batteryLife + " hrs";
    }
}
