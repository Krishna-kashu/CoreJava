package com.oopworkz.setter;
import java.util.Objects;

public class Watch {
    private String dialShape;
    private boolean isWaterResistant;
    private String brand;
    private double price;

    public Watch() {
        System.out.println("no argument constructor of Watch...");
    }

    public void setDialShape(String dialShape) {
        this.dialShape = dialShape;
    }

    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Watch{" +"dialShape=" + dialShape +", isWaterResistant=" + isWaterResistant +", brand=" + brand +", price=" + price +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Watch) {
            Watch other = (Watch) obj;
            if (Objects.equals(this.brand, other.brand) &&
                    Objects.equals(this.isWaterResistant,other.isWaterResistant)) {
                System.out.println("Watch is matching..");
                return true;
            }
        }
        return false;
    }
}
