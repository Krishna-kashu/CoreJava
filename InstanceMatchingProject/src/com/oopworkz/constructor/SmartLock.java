package com.oopworkz.constructor;
import java.util.Objects;

public class SmartLock {

    private int batteryLife;
    private boolean hasFingerprint;
    private String brand;
    private String color;

    public SmartLock(int batteryLife, boolean hasFingerprint, String brand, String color) {
        this.batteryLife = batteryLife;
        this.hasFingerprint = hasFingerprint;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartLock{" +"batteryLife=" + batteryLife +", hasFingerprint=" + hasFingerprint +
                ", brand='" + brand + ", color='" + color +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof SmartLock) {
            SmartLock other = (SmartLock) obj;
            if (Objects.equals(this.batteryLife, other.batteryLife) &&
                    Objects.equals(this.brand, other.brand)) {
                System.out.println("SmartLock is matching..");
                return true;
            }
        }
        return false;
    }
}
