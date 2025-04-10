package com.product;

public class Shampoo extends Product {
    public Shampoo() {
        System.out.println("no-arg constructor of Shampoo");
    }

    @Override
    public void apply() {
        System.out.println("Running overridden apply() in Shampoo");
    }

    void lather() {
        System.out.println("Running lather() in Shampoo");
    }
}
