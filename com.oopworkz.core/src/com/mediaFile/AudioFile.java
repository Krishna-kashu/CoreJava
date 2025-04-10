package com.mediaFile;

public class AudioFile extends MediaFile {
    public AudioFile() {
        System.out.println("no-arg constructor of AudioFile");
    }

    @Override
    public void play() {
        System.out.println("Running overridden play() in AudioFile");
    }

    void adjustVolume() {
        System.out.println("Running adjustVolume() in AudioFile");
    }
}
