package com.oopworkz.setter;
import java.util.Objects;

public class Television {
    private String model;
    private String resolution;
    private boolean isSmart;
    private String brand;

    public Television() {
        System.out.println("no argument constructor of Television...");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Television{" +
                "model='" + model + '\'' +
                ", resolution='" + resolution + '\'' +
                ", isSmart=" + isSmart +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Television) {
            Television other = (Television) obj;
            if (Objects.equals(this.model, other.model) &&
                    Objects.equals(this.resolution, other.resolution)) {
                System.out.println("Television is matching..");
                return true;
            }
        }
        return false;
    }
}
