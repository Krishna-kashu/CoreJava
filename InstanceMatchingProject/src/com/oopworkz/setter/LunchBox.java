package com.oopworkz.setter;
import java.util.Objects;

public class LunchBox {
    private String color;
    private int cost;
    private String brand;
    private String shape;

    public LunchBox() {
        System.out.println("No-arg constructor of LunchBox...");
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

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "LunchBox{" + "color=" + color + ", cost=" + cost + ", brand=" + brand + ", shape=" + shape + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof LunchBox) {
            LunchBox other = (LunchBox) obj;
            if (Objects.equals(this.color, other.color) && Objects.equals(this.cost, other.cost)) {
                System.out.println("LunchBox is matching..");
                return true;
            }
        }
        return false;
    }
}
