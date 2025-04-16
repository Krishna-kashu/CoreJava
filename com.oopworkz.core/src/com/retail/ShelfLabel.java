package com.retail;

public class ShelfLabel {
    private String item;
    private double price;
    public ShelfLabel() {
        System.out.println("no-arg constructor of ShelfLabel");
    }

    public void displayPrice() {
        System.out.println("Running displayPrice() in ShelfLabel");
    }
        public void setItem(String item) {
        this.item = item;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ShelfLabel(ShelfLabel ref) {
        this.item = ref.item;
        this.price = ref.price;
    }

    @Override
    public String toString() {
        return "Item: " + item + ", Price: $" + price;
    }

}
