package com.music;

public class Guitar extends Instrument {
    public Guitar() {
        System.out.println("Guitar constructor called");
    }

    @Override
    public void play() {
        System.out.println("Strumming the guitar");
    }

    public void tune() {
        System.out.println("Tuning the guitar");
    }
}
