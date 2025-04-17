package com.oopworkz.setter;
import java.util.Objects;

public class Luggage {
    private String brand;
    private int capacity;
    private boolean hasWheels;
    private double weight;

    public Luggage() {
        System.out.println("No-arg constructor of Luggage...");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Luggage{" + "brand=" + brand + ", capacity=" + capacity + ", hasWheels=" + hasWheels + ", weight=" + weight + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Luggage) {
            Luggage other = (Luggage) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.capacity, other.capacity)) {
                System.out.println("Luggage is matching..");
                return true;
            }
        }
        return false;
    }
}
