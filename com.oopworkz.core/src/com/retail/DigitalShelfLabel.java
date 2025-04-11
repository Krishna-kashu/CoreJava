package com.retail;

public class DigitalShelfLabel extends ShelfLabel {
    public DigitalShelfLabel() {
        System.out.println("no-arg constructor of DigitalShelfLabel");
    }

    @Override
    public void displayPrice() {
        System.out.println("Running overridden displayPrice() in DigitalShelfLabel");
    }

    void syncInventory() {
        System.out.println("Running syncInventory() in DigitalShelfLabel");
    }
}
