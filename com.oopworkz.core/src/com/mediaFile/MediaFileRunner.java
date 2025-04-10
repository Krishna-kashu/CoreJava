package com.mediaFile;

public class MediaFileRunner {
    public static void main(String[] args) {
        MediaFile mf = new MediaFile();
        mf.play();

        MediaFile mf1 = new AudioFile();
        mf1.play();

        System.out.println("**********");

        AudioFile af = new AudioFile();
        af.play();
        af.adjustVolume();
    }
}
