package com.appliance;

public class Appliance {
    private String brandName;
    private double powerUsage;
    public Appliance() {
        System.out.println("no-arg constructor of Appliance");
    }

    public void turnOn() {
        System.out.println("Running turnOn() in Appliance");
    }
    public Appliance(String brandName, double powerUsage) {
        this.brandName = brandName;
        this.powerUsage = powerUsage;
        System.out.println("String, double constructor of Appliance");
    }

    public Appliance(Appliance ref) {
        this.brandName = ref.brandName;
        this.powerUsage = ref.powerUsage;
    }

    @Override
    public String toString() {
        return "Appliance brand: " + brandName + ", Power Usage: " + powerUsage + "W";
    }
}
