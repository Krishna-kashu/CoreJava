package com.library;

public class Book {
    private String title;
    private int pages;
    public Book() {
        System.out.println("Constructor of Book");
    }

    public void read() {
        System.out.println("Reading a book");
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book(Book ref) {
        this.title = ref.title;
        this.pages = ref.pages;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Pages: " + pages;
    }

}
