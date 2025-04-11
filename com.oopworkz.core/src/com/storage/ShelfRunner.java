package com.storage;

public class ShelfRunner {
    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        shelf.placeItem();

        Shelf shelf1 = new Bookshelf();
        shelf1.placeItem();

        System.out.println("**********");

        Bookshelf bookShelf = new Bookshelf();
        bookShelf.placeItem();
        bookShelf.arrangeBooks();
    }
}
