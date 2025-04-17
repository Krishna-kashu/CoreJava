package com.oopworkz.setter;
import java.util.Objects;

public class CeilingFan {
    private int speedLevels;
    private double bladeSpan;    // in inches
    private boolean hasRemote;
    private String brand;

    public CeilingFan() {
        System.out.println("no argument constructor of CeilingFan...");
    }

    public void setSpeedLevels(int speedLevels) {
        this.speedLevels = speedLevels;
    }

    public void setBladeSpan(double bladeSpan) {
        this.bladeSpan = bladeSpan;
    }

    public void setHasRemote(boolean hasRemote) {
        this.hasRemote = hasRemote;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "CeilingFan{" +"speedLevels=" + speedLevels +", bladeSpan=" + bladeSpan +", hasRemote=" + hasRemote +", brand='" + brand + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CeilingFan) {
            CeilingFan other = (CeilingFan) obj;
            if (Objects.equals(this.speedLevels, other.speedLevels) &&
                    Objects.equals(this.brand, other.brand)) {
                System.out.println("CeilingFan is matching..");
                return true;
            }
        }
        return false;
    }
}
