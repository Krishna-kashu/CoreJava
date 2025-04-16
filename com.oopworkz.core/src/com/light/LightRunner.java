package com.light;

public class LightRunner {
    public static void main(String[] args) {
        Light light = new Light();
        light.switchOn();

        Light light1 = new SmartLight();
        light1.switchOn();

        System.out.println("**********");

        SmartLight smart = new SmartLight();
        smart.switchOn();
        smart.connectToApp();

        Light light2 = new Light();
        light2.setColor("White");
        light2.setBrightness(800);

        Light light3 = new Light(light2);
        System.out.println(light3);
    }
}


