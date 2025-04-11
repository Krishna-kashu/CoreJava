package com.music;

public class InstrumentRunner {
    public static void main(String[] args) {
        Instrument i = new Instrument();
        i.play();

        Instrument i1 = new Guitar();
        i1.play();

        System.out.println("**********");

        Guitar g = new Guitar();
        g.play();
        g.tune();
    }
}
