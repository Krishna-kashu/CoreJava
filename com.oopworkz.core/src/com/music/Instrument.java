package com.music;

public class Instrument  {
    private String instrumentName;
    private String type;
    public Instrument() {
        System.out.println("Instrument constructor called");
    }

    public void play() {
        System.out.println("Playing the instrument");
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Instrument(Instrument ref) {
        this.instrumentName = ref.instrumentName;
        this.type = ref.type;
    }

    @Override
    public String toString() {
        return "Instrument: " + instrumentName + ", Type: " + type;
    }

}
