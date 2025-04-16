package com.sound;

public class Speaker {
    private String brand;
    private int volumeLevel;
    public Speaker() {
        System.out.println("Constructor of Speaker");
    }

    public void playSound() {
        System.out.println("Playing sound");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public Speaker(Speaker ref) {
        this.brand = ref.brand;
        this.volumeLevel = ref.volumeLevel;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Volume Level: " + volumeLevel;
    }

}
