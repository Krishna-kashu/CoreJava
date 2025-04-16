package com.mediaFile;

public class MediaFile {
    private String fileName;
    private double fileSize;
    public MediaFile() {
        System.out.println("no-arg constructor of MediaFile");
    }

    public void play() {
        System.out.println("Running play() in MediaFile");
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public MediaFile(MediaFile ref) {
        this.fileName = ref.fileName;
        this.fileSize = ref.fileSize;
    }

    @Override
    public String toString() {
        return "File Name: " + fileName + ", File Size: " + fileSize + " MB";
    }
}
