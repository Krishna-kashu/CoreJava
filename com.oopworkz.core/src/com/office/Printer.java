package com.office;

public class Printer {
    private String model;
    private int pagesPerMinute;
    public Printer() {
        System.out.println("Constructor of Printer");
    }

    public void print() {
        System.out.println("Printing document");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPagesPerMinute(int ppm) {
        this.pagesPerMinute = ppm;
    }

    public Printer(Printer ref) {
        this.model = ref.model;
        this.pagesPerMinute = ref.pagesPerMinute;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", PPM: " + pagesPerMinute;
    }

}
