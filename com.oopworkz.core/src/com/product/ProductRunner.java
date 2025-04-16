package com.product;

public class ProductRunner {
    public static void main(String[] args) {
        Product product = new Product();
        product.apply();

        Product product1 = new Shampoo();
        product1.apply();

        System.out.println("**********");

        Shampoo shampoo = new Shampoo();
        shampoo.apply();
        shampoo.lather();

        Product prod1 = new Product();
        prod1.setName("Laptop");
        prod1.setPrice(899.99);
        Product prod2 = new Product(prod1);
        System.out.println(prod2);

    }
}
