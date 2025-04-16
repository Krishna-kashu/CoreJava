package com.lamp;

public class Lamp {
    private String type;
    private int wattage;
    public Lamp() {
        System.out.println("no-arg constructor of Lamp");
    }

    public void turnOn() {
        System.out.println("Running turnOn() in Lamp");
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public Lamp(Lamp ref) {
        this.type = ref.type;
        this.wattage = ref.wattage;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Wattage: " + wattage + "W";
    }

}
