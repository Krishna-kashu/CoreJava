package com.oopworkz.constructor;
import java.util.Objects;

public class SewingMachine {

    private int stitchCount;
    private String motorType;
    private String brand;
    private boolean isAutomatic;

    public SewingMachine(int stitchCount, String motorType, String brand, boolean isAutomatic) {
        this.stitchCount = stitchCount;
        this.motorType = motorType;
        this.brand = brand;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public String toString() {
        return "SewingMachine{" +"stitchCount=" + stitchCount +", motorType='" + motorType + ", brand='" + brand +", isAutomatic=" + isAutomatic +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof SewingMachine) {
            SewingMachine other = (SewingMachine) obj;
            if (Objects.equals(this.stitchCount, other.stitchCount) &&
                    Objects.equals(this.motorType, other.motorType)) {
                System.out.println("SewingMachine is matching..");
                return true;
            }
        }
        return false;
    }
}
