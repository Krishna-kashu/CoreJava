package com.home;

public class Appliance {
    private String brand;
    private double powerUsage;
    public Appliance() {
        System.out.println("Appliance constructor called");
    }

    public void operate() {
        System.out.println("Operating the appliance");
    }

    public Appliance(String brand, double powerUsage) {
        this.brand = brand;
        this.powerUsage = powerUsage;
        System.out.println("String, double constructor of Appliance");
    }

    public Appliance(Appliance ref) {
        this.brand = ref.brand;
        this.powerUsage = ref.powerUsage;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Power Usage: " + powerUsage + "W";
    }
}
