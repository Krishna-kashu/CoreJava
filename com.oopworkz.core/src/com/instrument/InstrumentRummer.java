package com.instrument;

public class InstrumentRummer {
    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        instrument.play();

        Instrument instrument1 = new Guitar();
        instrument1.play();

        System.out.println("**********");

        Guitar guitar = new Guitar();
        guitar.play();
        guitar.tuneStrings();
        Instrument instrument2 = new Instrument("Violin", 12000.0);
        Instrument instrument3 = new Instrument(instrument2);
        System.out.println(instrument3);

    }
}
