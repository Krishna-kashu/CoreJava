package com.oopworkz.constructor;
import java.util.Objects;

public class Typewriter {

    private String brand;
    private boolean isElectric;
    private int keyCount;
    private String color;

    public Typewriter(String brand, boolean isElectric, int keyCount, String color) {
        this.brand = brand;
        this.isElectric = isElectric;
        this.keyCount = keyCount;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Typewriter{" +"brand='" + brand + ", isElectric=" + isElectric +", keyCount=" + keyCount +", color='" + color + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Typewriter) {
            Typewriter other = (Typewriter) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.keyCount,other.keyCount)) {
                System.out.println("Typewriter is matching..");
                return true;
            }
        }
        return false;
    }
}
