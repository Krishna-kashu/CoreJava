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

        ShelfLabel s1 = new ShelfLabel();
        s1.setItem("Milk");
        s1.setPrice(2.99);
        ShelfLabel s2 = new ShelfLabel(s1);
        System.out.println(s2);

    }
}
