package com.travel;

public class BagRunner {
    public static void main(String[] args) {
        Bag bag1 = new Bag();
        bag1.carry();

        Bag bag = new LaptopBag();
        bag.carry();

        System.out.println("**********");

        LaptopBag laptopBag = new LaptopBag();
        laptopBag.carry();
        laptopBag.protectLaptop();
    }
}
