package com.light;

public class Light {
    private String color;
    private int brightness;

    public Light() {
        System.out.println("no-arg constructor of Light");
    }

    public void switchOn() {
        System.out.println("Running switchOn() in Light");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public Light(Light ref) {
        this.color = ref.color;
        this.brightness = ref.brightness;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Brightness: " + brightness + " lumens";
    }

}
