package com.speaker;

public class Speaker {
    private String type;
    private double powerWatt;
    public Speaker() {
        System.out.println("no-arg constructor of Speaker");
    }

    public void playSound() {
        System.out.println("Running playSound() in Speaker");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPowerWatt(double powerWatt) {
        this.powerWatt = powerWatt;
    }

    public Speaker(Speaker ref) {
        this.type = ref.type;
        this.powerWatt = ref.powerWatt;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Power: " + powerWatt + "W";
    }

}
