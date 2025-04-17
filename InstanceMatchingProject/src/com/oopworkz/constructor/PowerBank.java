package com.oopworkz.constructor;
import java.util.Objects;

public class PowerBank {

    private double batteryCapacity;
    private int outputPorts;
    private String brand;
    private boolean isFastCharging;

    public PowerBank(double batteryCapacity, int outputPorts, String brand, boolean isFastCharging) {
        this.batteryCapacity = batteryCapacity;
        this.outputPorts = outputPorts;
        this.brand = brand;
        this.isFastCharging = isFastCharging;
    }

    @Override
    public String toString() {
        return "PowerBank{" +"batteryCapacity=" + batteryCapacity +", outputPorts=" + outputPorts +", brand='" + brand + ", isFastCharging=" + isFastCharging +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof PowerBank) {
            PowerBank other = (PowerBank) obj;
            if (Objects.equals(this.batteryCapacity, other.batteryCapacity) &&
                    Objects.equals(this.outputPorts, other.outputPorts)) {
                System.out.println("PowerBank is matching..");
                return true;
            }
        }
        return false;
    }
}
