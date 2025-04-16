package com.footwear;

public class Shoe {
    private String shoeBrand;
    private int shoeSize;
    public Shoe() {
        System.out.println("no-arg constructor of Shoe");
    }

    public void wear() {
        System.out.println("Running wear() in Shoe");
    }


    public Shoe(String shoeBrand, int shoeSize) {
        this.shoeBrand = shoeBrand;
        this.shoeSize = shoeSize;
        System.out.println("String, int constructor of Shoe");
    }

    public Shoe(Shoe ref) {
        this.shoeBrand = ref.shoeBrand;
        this.shoeSize = ref.shoeSize;
    }

    @Override
    public String toString() {
        return "Shoe Brand: " + shoeBrand + ", Size: " + shoeSize;
    }

}
