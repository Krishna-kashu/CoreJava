package com.oopworkz.constructor;
import java.util.Objects;

public class SmartMirror {

    private boolean hasTouchscreen;
    private double displaySize;
    private String resolution;
    private String brand;

    public SmartMirror(boolean hasTouchscreen, double displaySize, String resolution, String brand) {
        this.hasTouchscreen = hasTouchscreen;
        this.displaySize = displaySize;
        this.resolution = resolution;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "SmartMirror{" +"hasTouchscreen=" + hasTouchscreen +", displaySize=" + displaySize +", resolution='" + resolution + ", brand='" + brand + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof SmartMirror) {
            SmartMirror other = (SmartMirror) obj;
            if (Objects.equals(this.displaySize, other.displaySize )&&
                    Objects.equals(this.resolution, other.resolution)) {
                System.out.println("SmartMirror is matching..");
                return true;
            }
        }
        return false;
    }
}
