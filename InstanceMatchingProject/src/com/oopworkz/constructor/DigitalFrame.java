package com.oopworkz.constructor;
import java.util.Objects;

public class DigitalFrame {

    private double screenSize;
    private String resolution;
    private boolean hasWiFi;
    private String brand;

    public DigitalFrame(double screenSize, String resolution, boolean hasWiFi, String brand) {
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.hasWiFi = hasWiFi;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "DigitalFrame{" +"screenSize=" + screenSize +", resolution=" + resolution +", hasWiFi=" + hasWiFi +", brand=" + brand +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof DigitalFrame) {
            DigitalFrame other = (DigitalFrame) obj;
            if (Objects.equals(this.screenSize, other.screenSize) &&
                    Objects.equals(this.resolution, other.resolution)) {
                System.out.println("DigitalFrame is matching..");
                return true;
            }
        }
        return false;
    }
}
