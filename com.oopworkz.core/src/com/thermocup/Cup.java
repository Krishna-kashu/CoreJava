package com.thermocup;

public class Cup {
    private String color;
    private double volume;
    public Cup() {
        System.out.println("Constructor of Cup");
    }

    public void fill() {
        System.out.println("Filling the cup with drink");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Cup(Cup ref) {
        this.color = ref.color;
        this.volume = ref.volume;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Volume: " + volume + " ml";
    }

}