package com.oopworkz.setter;
import java.util.Objects;

public class Bicycle {
    private String brand;
    private int gearCount;
    private boolean isElectric;
    private double price;

    public Bicycle() {
        System.out.println("no argument constructor of Bicycle...");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "brand=" + brand + ", gearCount=" + gearCount + ", isElectric=" + isElectric + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bicycle) {
            Bicycle other = (Bicycle) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.gearCount,other.gearCount)) {
                System.out.println("Bicycle is matching..");
                return true;
            }
        }
        return false;
    }
}
