package com.oopworkz.constructor;
import java.util.Objects;

public class Toaster {

    private int sliceCapacity;
    private boolean hasTimer;
    private String color;
    private String brand;

    public Toaster(int sliceCapacity, boolean hasTimer, String color, String brand) {
        this.sliceCapacity = sliceCapacity;
        this.hasTimer = hasTimer;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Toaster{" +"sliceCapacity=" + sliceCapacity +", hasTimer=" + hasTimer +", color='" + color +", brand='" + brand +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Toaster) {
            Toaster toaster = (Toaster) obj;
            if (Objects.equals(this.hasTimer, toaster.hasTimer) &&
                    Objects.equals(this.sliceCapacity, toaster.sliceCapacity)) {
                System.out.println("Toaster is matching..");
                return true;
            }
        }
        return false;
    }
}
