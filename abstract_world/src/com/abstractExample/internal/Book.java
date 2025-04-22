package com.abstractExample.internal;

public abstract class Book {

    public void read() {
        System.out.println("Running Read in Book");
    }

    public void close() {
        System.out.println("Running Close in Book");
    }
}
