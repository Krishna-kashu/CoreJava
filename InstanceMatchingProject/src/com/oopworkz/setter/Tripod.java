package com.oopworkz.setter;
import java.util.Objects;

public class Tripod {
    private String material;
    private int cost;
    private String brand;
    private double height;

    public Tripod() {
        System.out.println("No-arg constructor of Tripod...");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Tripod{" + "material=" + material + ", cost=" + cost + ", brand=" + brand + ", height=" + height + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tripod) {
            Tripod other = (Tripod) obj;
            if (Objects.equals(this.material, other.material) && Objects.equals(this.cost, other.cost)) {
                System.out.println("Tripod is matching..");
                return true;
            }
        }
        return false;
    }
}
