package com.product;

public class Product {
    private String name;
    private double price;
    public Product() {
        System.out.println("no-arg constructor of Product");
    }

    public void apply() {
        System.out.println("Running apply in Product");
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(Product ref) {
        this.name = ref.name;
        this.price = ref.price;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: $" + price;
    }

}
