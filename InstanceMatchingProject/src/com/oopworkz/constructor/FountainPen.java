package com.oopworkz.constructor;
import java.util.Objects;

public class FountainPen {

    private double nibSize;
    private String inkColor;
    private String brand;
    private boolean isRefillable;

    public FountainPen(double nibSize, String inkColor, String brand, boolean isRefillable) {
        this.nibSize = nibSize;
        this.inkColor = inkColor;
        this.brand = brand;
        this.isRefillable = isRefillable;
    }

    @Override
    public String toString() {
        return "FountainPen{" +"nibSize=" + nibSize +", inkColor=" + inkColor + ", brand=" + brand + ", isRefillable=" + isRefillable +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FountainPen) {
            FountainPen fountainPen = (FountainPen) obj;
            if (Objects.equals(this.nibSize, fountainPen.nibSize) &&
                    Objects.equals(this.inkColor, fountainPen.inkColor)) {
                System.out.println("FountainPen is matching..");
                return true;
            }
        }
        return false;
    }
}
