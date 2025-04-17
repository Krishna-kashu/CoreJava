package com.oopworkz.constructor;
import java.util.Objects;

public class CoffeeGrinder {

    private String grinderType;
    private double capacity;
    private boolean isElectric;
    private String brand;

    public CoffeeGrinder(String grinderType, double capacity, boolean isElectric, String brand) {
        this.grinderType = grinderType;
        this.capacity = capacity;
        this.isElectric = isElectric;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "CoffeeGrinder{" + "grinderType='" + grinderType + ", capacity=" + capacity + ", isElectric=" + isElectric + ", brand='" + brand + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof CoffeeGrinder) {
            CoffeeGrinder other = (CoffeeGrinder) obj;
            if (Objects.equals(this.grinderType, other.grinderType) &&
                   Objects.equals( this.capacity, other.capacity)) {
                System.out.println("CoffeeGrinder is matching..");
                return true;
            }
        }
        return false;
    }
}