package com.oopworkz.setter;
import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Car() {
        System.out.println("no argument constructor of Car...");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", model=" + model + ", year=" + year + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Car) {
            Car car = (Car) obj;
            if (Objects.equals(this.brand, car.brand) &&
                    Objects.equals(this.model, car.model)) {
                System.out.println("Car is matching..");
                return true;
            }
        }
        return false;
    }
}
