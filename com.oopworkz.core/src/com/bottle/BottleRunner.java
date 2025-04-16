package com.bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        bottle.open();

        Bottle bottle1 = new WaterBottle();
        bottle1.open();

        System.out.println("**********");

        WaterBottle wb = new WaterBottle();
        wb.open();
        wb.refill();

        Bottle bottle2 = new Bottle(1000, "Blue");
        Bottle bottle3 = new Bottle(bottle2);
        System.out.println(bottle3);
    }
}
