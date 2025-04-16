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
        Shelf shelf2 = new Shelf();
        shelf2.setNumberOfCompartments(4);
        shelf2.setMaterial("Metal");

        Shelf shelf3 = new Shelf(shelf2);
        System.out.println(shelf3);

    }
}
