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

        Book b1 = new Book("The Programming", 1097);
        Book b2 = new Book(b1);
        System.out.println(b2);
    }
}
