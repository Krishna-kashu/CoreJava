package com.notebook;

public class Notebook {
    private String brand;
    private int numberOfPages;
    public Notebook() {
        System.out.println("no-arg constructor of Notebook");
    }

    public void write() {
        System.out.println("Running write() in Notebook");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Notebook(Notebook ref) {
        this.brand = ref.brand;
        this.numberOfPages = ref.numberOfPages;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Pages: " + numberOfPages;
    }

}
