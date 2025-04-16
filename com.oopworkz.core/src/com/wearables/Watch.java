package com.wearables;

public class Watch  {
    private String brand;
    private boolean smartWatch;
    public Watch() {
        System.out.println("Constructor of Watch");
    }

    public void showTime() {
        System.out.println("Showing time on analog watch");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSmartWatch(boolean smartWatch) {
        this.smartWatch = smartWatch;
    }

    public Watch(Watch ref) {
        this.brand = ref.brand;
        this.smartWatch = ref.smartWatch;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Smart: " + smartWatch;
    }

}
