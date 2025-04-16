package com.tv;

public class TV {
    private String brand;
    private int screenSize;
    public TV() {
        System.out.println("no-arg constructor of TV");
    }

    public void powerOn() {
        System.out.println("Running powerOn in TV");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public TV(TV ref) {
        this.brand = ref.brand;
        this.screenSize = ref.screenSize;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Screen Size: " + screenSize + " inches";
    }

}
