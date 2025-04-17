package com.oopworkz.setter;
import java.util.Objects;

public class Blender {
    private String model;
    private double price;
    private boolean isAutomatic;
    private String brand;

    public Blender() {
        System.out.println("no argument constructor of Blender...");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Blender{" +"model=" + model + ", price=" + price +", isAutomatic=" + isAutomatic +", brand=" + brand +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Blender) {
            Blender other = (Blender) obj;
            if (Objects.equals(this.model, other.model) &&
                    Objects.equals(this.price , other.price)) {
                System.out.println("Blender is matching..");
                return true;
            }
        }
        return false;
    }
}
