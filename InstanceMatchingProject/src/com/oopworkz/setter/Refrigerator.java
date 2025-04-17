package com.oopworkz.setter;
import java.util.Objects;

public class Refrigerator {
    private double volumeLiters;
    private boolean hasFreezer;
    private String brand;
    private String energyRating;

    public Refrigerator() {
        System.out.println("no argument constructor of Refrigerator...");
    }

    public void setVolumeLiters(double volumeLiters) {
        this.volumeLiters = volumeLiters;
    }

    public void setHasFreezer(boolean hasFreezer) {
        this.hasFreezer = hasFreezer;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setEnergyRating(String energyRating) {
        this.energyRating = energyRating;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +"volumeLiters=" + volumeLiters +", hasFreezer=" + hasFreezer +", brand='" + brand + ", energyRating=" + energyRating +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Refrigerator) {
            Refrigerator other = (Refrigerator) obj;
            if (Objects.equals(this.volumeLiters,other.volumeLiters) &&
                    Objects.equals(this.energyRating, other.energyRating)) {
                System.out.println("Refrigerator is matching..");
                return true;
            }
        }
        return false;
    }
}
