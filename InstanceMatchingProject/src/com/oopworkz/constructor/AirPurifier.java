package com.oopworkz.constructor;
import java.util.Objects;

public class AirPurifier {

    private double filterSize;
    private String brand;
    private boolean isHEPAFilter;
    private String color;

    public AirPurifier(double filterSize, String brand, boolean isHEPAFilter, String color) {
        this.filterSize = filterSize;
        this.brand = brand;
        this.isHEPAFilter = isHEPAFilter;
        this.color = color;
    }

    @Override
    public String toString() {
        return "AirPurifier{" +"filterSize=" + filterSize +", brand='" + brand +", isHEPAFilter=" + isHEPAFilter +", color='" + color +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof AirPurifier) {
            AirPurifier other = (AirPurifier) obj;
            if (Objects.equals(this.filterSize, other.filterSize) &&
                    Objects.equals(this.brand, other.brand)) {
                System.out.println("AirPurifier is matching..");
                return true;
            }
        }
        return false;
    }
}
