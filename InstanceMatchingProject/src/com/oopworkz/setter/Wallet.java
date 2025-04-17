package com.oopworkz.setter;
import java.util.Objects;

public class Wallet {
    private String material;
    private int capacity;      // number of cards
    private boolean hasZipper;
    private String color;

    public Wallet() {
        System.out.println("no argument constructor of Wallet...");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setHasZipper(boolean hasZipper) {
        this.hasZipper = hasZipper;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wallet{" +"material=" + material + ", capacity=" + capacity +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Wallet) {
            Wallet other = (Wallet) obj;
            if (Objects.equals(this.material, other.material) &&
                    Objects.equals(this.capacity,other.capacity)) {
                System.out.println("Wallet is matching..");
                return true;
            }
        }
        return false;
    }
}
