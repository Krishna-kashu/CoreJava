package com.interior;

public class Table extends Furniture {
    public Table() {
        System.out.println("Table constructor called");
    }

    @Override
    public void place() {
        System.out.println("Setting up the table");
    }

    public void fold() {
        System.out.println("Folding the table");
    }
}
