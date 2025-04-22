package com.abstractExample.external;
import com.abstractExample.internal.Book;

public class FictionBook extends Book {

    @Override
    public void close() {
            System.out.println("running Close in FictionBook");
        }

    @Override
    public void read() {
            System.out.println("Running Read in FictionBook");
        }
    }
