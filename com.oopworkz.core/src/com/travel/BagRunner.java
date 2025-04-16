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
        Bag bag2 = new Bag();
        bag2.setBrand("Skybags");
        bag2.setCompartments(3);

        Bag bag3 = new Bag(bag2);
        System.out.println(bag3);


    }
}
