package com.led;

public class LEDRunner {
    public static void main(String[] args) {

        System.out.println("\n******Light******");
        Light light = new Light();
        light.glow();

        System.out.println("\n****** LED ******");
        LED led = new LED();
        led.energyEfficient();
        led.glow();
    }
}
