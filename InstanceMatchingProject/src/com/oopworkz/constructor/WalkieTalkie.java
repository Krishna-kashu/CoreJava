package com.oopworkz.constructor;
import java.util.Objects;

public class WalkieTalkie {

    private int range;
    private int batteryLife;
    private boolean hasDisplay;
    private String brand;

    public WalkieTalkie(int range, int batteryLife, boolean hasDisplay, String brand) {
        this.range = range;
        this.batteryLife = batteryLife;
        this.hasDisplay = hasDisplay;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "WalkieTalkie{" + "range=" + range + ", batteryLife=" + batteryLife + ", hasDisplay=" + hasDisplay + ", brand=" + brand + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof WalkieTalkie) {
            WalkieTalkie other = (WalkieTalkie) obj;
            if (Objects.equals(this.range, other.range) &&
                    Objects.equals(this.batteryLife, other.batteryLife)) {
                System.out.println("WalkieTalkie is matching..");
                return true;
            }
        }
        return false;
    }
}