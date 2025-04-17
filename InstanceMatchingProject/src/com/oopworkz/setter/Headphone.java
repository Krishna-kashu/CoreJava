package com.oopworkz.setter;
import java.util.Objects;

public class Headphone {
    private String type;      // over-ear, in-ear
    private boolean isWireless;
    private int batteryLife;  // hours
    private String brand;

    public Headphone() {
        System.out.println("no argument constructor of Headphone...");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Headphone{" +"type=" + type + ", isWireless=" + isWireless +", batteryLife=" + batteryLife +", brand=" + brand +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Headphone) {
            Headphone other = (Headphone) obj;
            if (Objects.equals(this.type, other.type) &&
                   Objects.equals(this.batteryLife,other.batteryLife)) {
                System.out.println("Headphone is matching..");
                return true;
            }
        }
        return false;
    }
}
