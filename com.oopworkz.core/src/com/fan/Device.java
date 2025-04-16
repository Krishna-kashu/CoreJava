package com.fan;

public class Device {
    private String fanBrand;
    private int fanSpeed;

    public Device() {
        System.out.println("no-arg constructor of Device");
    }

    public void start() {
        System.out.println("Running start() in Device");
    }

    public Device(String fanBrand, int fanSpeed) {
        this.fanBrand = fanBrand;
        this.fanSpeed = fanSpeed;
        System.out.println("String, int constructor of Fan Device");
    }

    public Device(Device ref) {
        this.fanBrand = ref.fanBrand;
        this.fanSpeed = ref.fanSpeed;
    }

    @Override
    public String toString() {
        return "Fan Brand: " + fanBrand + ", Speed: " + fanSpeed + " RPM";
    }

}
