package com.microwave;

public class Microwave {
    private int powerWatts;
    private String brand;
    public Microwave() {
        System.out.println("no-arg constructor of Microwave");
    }

    public void heat() {
        System.out.println("Running heat() in Microwave");
    }

    public void setPowerWatts(int powerWatts) {
        this.powerWatts = powerWatts;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Microwave(Microwave ref) {
        this.powerWatts = ref.powerWatts;
        this.brand = ref.brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Power: " + powerWatts + "W";
    }

}
