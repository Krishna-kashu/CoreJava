package com.abstractExample.runner;
import com.abstractExample.external.FictionBook;
import com.abstractExample.internal.Book;

public class BookRunner {

    public static void main(String[] args) {
        Book book = new FictionBook();

        book.read();
        book.close();
    }
}
