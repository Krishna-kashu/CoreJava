package com.oopworkz.setter;
import java.util.Objects;

public class Laptop {
    private String brand;
    private int ram;
    private double price;
    private boolean isTouchScreen;

    public Laptop() {
        System.out.println("no argument constructor of Laptop...");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTouchScreen(boolean isTouchScreen) {
        this.isTouchScreen = isTouchScreen;
    }

    @Override
    public String toString() {
        return "Laptop{" + "brand='" + brand + "', ram=" + ram + "GB, price=" + price + ", isTouchScreen=" + isTouchScreen + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Laptop) {
            Laptop other = (Laptop) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.ram , other.ram)) {
                System.out.println("Laptop is matching..");
                return true;
            }
        }
        return false;
    }
}
