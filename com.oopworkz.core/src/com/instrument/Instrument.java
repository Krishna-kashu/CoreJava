package com.instrument;

public class Instrument {
    private String instrumentName;
    private double price;

    public Instrument() {
        System.out.println("no-arg constructor of Instrument");
    }

    public void play() {
        System.out.println("Running play() in Instrument");
    }

    public Instrument(String instrumentName, double price) {
        this.instrumentName = instrumentName;
        this.price = price;
        System.out.println("String, double constructor of Instrument");
    }

    public Instrument(Instrument ref) {
        this.instrumentName = ref.instrumentName;
        this.price = ref.price;
    }

    @Override
    public String toString() {
        return "Instrument Name: " + instrumentName + ", Price: ₹" + price;
    }

}