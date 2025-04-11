package com.storage;

public class Bookshelf extends Shelf {
    public Bookshelf() {
        System.out.println("no-arg constructor of Bookshelf");
    }

    @Override
    public void placeItem() {
        System.out.println("Running overridden placeItem() in Bookshelf");
    }

    void arrangeBooks() {
        System.out.println("Running arrangeBooks() in Bookshelf");
    }
}
