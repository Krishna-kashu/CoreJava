package com.oopworkz.setter;
import java.util.Objects;

public class Speaker {
    private String model;
    private double price;
    private boolean isWireless;
    private String brand;

    public Speaker() {
        System.out.println("no argument constructor of Speaker...");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Speaker{" +"model='" + model +", price=" + price +", isWireless=" + isWireless +", brand='" + brand + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Speaker) {
            Speaker other = (Speaker) obj;
            if (Objects.equals(this.model, other.model) &&
                    Objects.equals(this.price, other.price)) {
                System.out.println("Speaker is matching..");
                return true;
            }
        }
        return false;
    }
}
