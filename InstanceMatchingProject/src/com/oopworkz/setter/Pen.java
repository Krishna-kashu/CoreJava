package com.oopworkz.setter;

import java.util.Objects;

public class Pen {
    private String color;
    private int cost;
    private String brand;
    private double length;

    public Pen() {
        System.out.println("no argument constructor of Pen...");
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

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Pen{" + "color='" + color  + ", cost=" + cost + ", brand='" + brand  + ", length=" + length + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pen) {
            Pen other = (Pen) obj;
            if (Objects.equals(this.color, other.color) &&
                    Objects.equals(this.cost, other.cost)) {
                System.out.println("Pen is matching..");
                return true;
            }
        }
        return false;
    }
}
