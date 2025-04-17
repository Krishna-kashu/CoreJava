package com.oopworkz.setter;
import java.util.Objects;

public class Mug {
    private double capacity;    // in ml
    private String material;
    private String color;
    private boolean isInsulated;

    public Mug() {
        System.out.println("no argument constructor of Mug...");
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInsulated(boolean insulated) {
        isInsulated = insulated;
    }

    @Override
    public String toString() {
        return "Mug{" +"capacity=" + capacity +", material=" + material +", color=" + color + ", isInsulated=" + isInsulated +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Mug) {
            Mug other = (Mug) obj;
            if (Objects.equals(this.capacity ,other.capacity) &&
                    Objects.equals(this.material, other.material)) {
                System.out.println("Mug is matching..");
                return true;
            }
        }
        return false;
    }
}
