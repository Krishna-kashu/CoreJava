package com.library;

public class AudioBook extends Book {
    public AudioBook() {
        System.out.println("Constructor of AudioBook");
    }

    @Override
    public void read() {
        System.out.println("Listening to audiobook");
    }

    public void playAudio() {
        System.out.println("Playing audio from audiobook");
    }
}
