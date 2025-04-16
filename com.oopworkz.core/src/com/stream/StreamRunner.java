package com.stream;

public class StreamRunner {
    public static void main(String[] args) {
        Stream stream = new Stream();
        stream.start();

        Stream stream1 = new AudioStream();
        stream1.start();

        System.out.println("**********");

        AudioStream audio = new AudioStream();
        audio.start();
        audio.end();

        Stream s1 = new Stream();
        s1.setPlatform("YouTube");
        s1.setIsLive(true);

        Stream s2 = new Stream(s1);
        System.out.println(s2);

    }
}
