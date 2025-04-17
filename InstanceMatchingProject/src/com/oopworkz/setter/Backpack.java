package com.oopworkz.setter;
import java.util.Objects;

public class Backpack {
    private double volume;    // liters
    private int compartments;
    private boolean isWaterproof;
    private String brand;

    public Backpack() {
        System.out.println("no argument constructor of Backpack...");
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setCompartments(int compartments) {
        this.compartments = compartments;
    }

    public void setWaterproof(boolean waterproof) {
        isWaterproof = waterproof;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Backpack{ volume=" + volume +", compartments=" + compartments +", isWaterproof=" + isWaterproof +", brand='" + brand +"}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Backpack) {
            Backpack other = (Backpack) obj;
            if (this.compartments == other.compartments &&
                    Objects.equals(this.brand, other.brand)) {
                System.out.println("Backpack is matching..");
                return true;
            }
        }
        return false;
    }
}
