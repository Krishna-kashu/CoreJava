package com.oopworkz.setter;
import java.util.Objects;

public class Helmet {
    private String color;
    private int cost;
    private String brand;
    private String size;

    public Helmet() {
        System.out.println("No-arg constructor of Helmet...");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Helmet{" + "color=" + color + ", cost=" + cost + ", brand=" + brand + ", size=" + size + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Helmet) {
            Helmet other = (Helmet) obj;
            if (Objects.equals(this.color, other.color) && Objects.equals(this.cost, other.cost)) {
                System.out.println("Helmet is matching..");
                return true;
            }
        }
        return false;
    }
}
