package com.oopworkz.setter;
import java.util.Objects;

public class Joystick {
    private String brand;
    private int cost;
    private String connectivity;
    private int buttons;

    public Joystick() {
        System.out.println("No-arg constructor of Joystick...");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }

    @Override
    public String toString() {
        return "Joystick{" + "brand=" + brand + ", cost=" + cost + ", connectivity=" + connectivity + ", buttons=" + buttons + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Joystick) {
            Joystick other = (Joystick) obj;
            if (Objects.equals(this.brand, other.brand) && Objects.equals(this.cost, other.cost)) {
                System.out.println("Joystick is matching..");
                return true;
            }
        }
        return false;
    }
}
