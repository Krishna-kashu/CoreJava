package com.oopworkz.constructor;
import java.util.Objects;

public class WaterPurifier {

    private String filterType;
    private double tankCapacity;
    private boolean isElectric;
    private String brand;

    public WaterPurifier(String filterType, double tankCapacity, boolean isElectric, String brand) {
        this.filterType = filterType;
        this.tankCapacity = tankCapacity;
        this.isElectric = isElectric;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "WaterPurifier{" +"filterType='" + filterType + ", tankCapacity=" + tankCapacity +", isElectric=" + isElectric +", brand='" + brand +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof WaterPurifier) {
            WaterPurifier other = (WaterPurifier) obj;
            if (Objects.equals(this.filterType, other.filterType) &&
                    Objects.equals(this.brand, other.brand)) {
                System.out.println("WaterPurifier is matching..");
                return true;
            }
        }
        return false;
    }
}
