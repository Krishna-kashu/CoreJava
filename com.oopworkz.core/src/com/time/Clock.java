package com.time;

public class Clock {
    private String type;
    private String brand;

    public Clock() {
        System.out.println("Constructor of Clock");
    }

    public void showTime() {
        System.out.println("Displaying analog time");
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Clock(Clock ref) {
        this.type = ref.type;
        this.brand = ref.brand;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Brand: " + brand;
    }

}
