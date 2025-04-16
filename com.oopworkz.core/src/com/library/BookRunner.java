package com.library;

public class BookRunner {
    public static void main(String[] args) {
        Book b = new Book();
        b.read();

        Book b1 = new AudioBook();
        b1.read();

        System.out.println("**********");

        AudioBook ab = new AudioBook();
        ab.read();
        ab.playAudio();

        Book book1 = new Book();
        book1.setTitle("Java Programming");
        book1.setPages(500);

        Book book2 = new Book(book1);
        System.out.println(book2);
    }
}
