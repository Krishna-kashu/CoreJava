package com.book;

public class BookRunner {
    public static void main(String[] args) {
        Book book=new Book();
        book.read();
        Book book1=new EBook();
        book1.read();

        System.out.println("**********");
        EBook eBook=new EBook();
        eBook.read();
        eBook.download();


    }
}
