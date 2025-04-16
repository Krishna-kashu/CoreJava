package com.instrument;

public class Guitar extends Instrument {
    public Guitar() {
        System.out.println("no-arg constructor of Guitar");
    }

    @Override
    public void play() {
        System.out.println("Running overridden play in Guitar");
    }

    void tuneStrings() {
        System.out.println("Running tuneStrings in Guitar");
    }

}
