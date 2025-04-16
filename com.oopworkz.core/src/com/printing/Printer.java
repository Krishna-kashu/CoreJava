package com.printing;

public class Printer {
    private String model;
    private boolean colorPrinter;
    public Printer() {
        System.out.println("no-arg constructor of Printer");
    }

    public void print() {
        System.out.println("Running print() in Printer");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColorPrinter(boolean colorPrinter) {
        this.colorPrinter = colorPrinter;
    }

    public Printer(Printer ref) {
        this.model = ref.model;
        this.colorPrinter = ref.colorPrinter;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Color: " + colorPrinter;
    }

}
