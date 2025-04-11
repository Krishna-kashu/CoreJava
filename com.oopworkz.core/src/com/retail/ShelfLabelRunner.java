package com.retail;

public class ShelfLabelRunner {
    public static void main(String[] args) {
        ShelfLabel label = new ShelfLabel();
        label.displayPrice();

        ShelfLabel label1 = new DigitalShelfLabel();
        label1.displayPrice();

        System.out.println("**********");

        DigitalShelfLabel digital = new DigitalShelfLabel();
        digital.displayPrice();
        digital.syncInventory();
    }
}
