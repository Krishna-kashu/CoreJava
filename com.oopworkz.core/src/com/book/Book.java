package com.book;

public class Book {
    private String title;
    private int pages;
    public Book(){
        System.out.println("no-arg constructor of Book");
    }
    public void read(){
        System.out.println("Running read() in Book");
    }
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        System.out.println("String, int constructor of Book");
    }

    public Book(Book ref) {
        this.title = ref.title;
        this.pages = ref.pages;
    }

    @Override
    public String toString() {
        return "Book Title: " + title + ", Pages: " + pages;
    }
}
