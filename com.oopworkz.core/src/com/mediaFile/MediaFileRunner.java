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
        MediaFile media1 = new MediaFile();
        media1.setFileName("video.mp4");
        media1.setFileSize(1024.5);

        MediaFile media2 = new MediaFile(media1);
        System.out.println(media2);

    }
}
