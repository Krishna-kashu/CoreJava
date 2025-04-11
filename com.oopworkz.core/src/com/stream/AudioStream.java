package com.stream;

public class AudioStream extends Stream {
    public AudioStream() {
        System.out.println("no-arg constructor of AudioStream");
    }

    @Override
    public void start() {
        System.out.println("Running overridden start in AudioStream");
    }

    void end() {
        System.out.println("Running end in AudioStream");
    }
}
