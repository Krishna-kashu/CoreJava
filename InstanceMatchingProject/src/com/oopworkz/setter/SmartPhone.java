package com.oopworkz.setter;
import java.util.Objects;

public class SmartPhone {
    private String brand;
    private int storage;
    private boolean is5GEnabled;
    private double price;

    public SmartPhone() {
        System.out.println("no argument constructor of SmartPhone...");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void set5GEnabled(boolean is5GEnabled) {
        this.is5GEnabled = is5GEnabled;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "brand=" + brand + ", storage=" + storage + "GB, is5GEnabled=" + is5GEnabled + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof SmartPhone) {
            SmartPhone other = (SmartPhone) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    this.storage == other.storage) {
                System.out.println("SmartPhone is matching..");
                return true;
            }
        }
        return false;
    }
}
