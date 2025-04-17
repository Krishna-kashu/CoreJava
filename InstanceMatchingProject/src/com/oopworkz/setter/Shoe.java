package com.oopworkz.setter;
import java.util.Objects;

public class Shoe {
    private String size;
    private String material;
    private String brand;
    private double price;

    public Shoe() {
        System.out.println("no argument constructor of Shoe...");
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shoe{" +"size='" + size +", material='" + material + ", brand='" + brand + ", price=" + price +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Shoe) {
            Shoe shoe = (Shoe) obj;
            if (Objects.equals(this.size, shoe.size) &&
                    Objects.equals(this.brand, shoe.brand)) {
                System.out.println("Shoe is matching..");
                return true;
            }
        }
        return false;
    }
}
