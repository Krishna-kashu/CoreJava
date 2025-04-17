package com.oopworkz.setter;
import java.util.Objects;

public class Lamp {
    private String type;       // LED, Incandescent
    private double wattage;
    private String color;
    private String brand;

    public Lamp() {
        System.out.println("no argument constructor of Lamp...");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Lamp{" +"type=" + type+", wattage=" + wattage +", color=" + color + ", brand=" + brand + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Lamp) {
            Lamp other = (Lamp) obj;
            if (Objects.equals(this.type, other.type) &&
                    Objects.equals(this.wattage,other.wattage)) {
                System.out.println("Lamp is matching..");
                return true;
            }
        }
        return false;
    }
}
