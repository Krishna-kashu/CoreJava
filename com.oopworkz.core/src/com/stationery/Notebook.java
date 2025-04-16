package com.stationery;

public class Notebook {
    private String brand;
    private int pages;
    public Notebook() {
        System.out.println("no-arg constructor of Notebook");
    }

    public void open() {
        System.out.println("Running open() in Notebook");
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Notebook(Notebook ref) {
        this.brand = ref.brand;
        this.pages = ref.pages;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Pages: " + pages;
    }

}
