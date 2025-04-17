package com.oopworkz.constructor;
import java.util.Objects;

public class ElectricScooter {

    private int batteryCapacity;
    private double maxSpeed;
    private String brand;
    private boolean hasBluetooth;

    public ElectricScooter(int batteryCapacity, double maxSpeed, String brand, boolean hasBluetooth) {
        this.batteryCapacity = batteryCapacity;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.hasBluetooth = hasBluetooth;
    }

    @Override
    public String toString() {
        return "ElectricScooter{" +
                "batteryCapacity=" + batteryCapacity +
                ", maxSpeed=" + maxSpeed +
                ", brand='" + brand + '\'' +
                ", hasBluetooth=" + hasBluetooth +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ElectricScooter) {
            ElectricScooter other = (ElectricScooter) obj;
            if (this.batteryCapacity == other.batteryCapacity &&
                    this.maxSpeed == other.maxSpeed) {
                System.out.println("ElectricScooter is matching..");
                return true;
            }
        }
        return false;
    }
}
