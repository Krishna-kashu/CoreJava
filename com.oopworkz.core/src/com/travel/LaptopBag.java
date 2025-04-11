package com.travel;

public class LaptopBag extends Bag {
    public LaptopBag() {
        System.out.println("Constructor of LaptopBag");
    }

    @Override
    public void carry() {
        System.out.println("Carrying a padded laptop bag");
    }

    public void protectLaptop() {
        System.out.println("Laptop protected inside the bag");
    }
}
