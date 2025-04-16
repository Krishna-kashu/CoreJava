package com.file;

public class File {
    private String fileName;
    private int fileSize;
    public File() {
        System.out.println("no-arg constructor of File");
    }

    public void open() {
        System.out.println("Running open() in File");
    }


    public File(String fileName, int fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        System.out.println("String, int constructor of File");
    }

    public File(File ref) {
        this.fileName = ref.fileName;
        this.fileSize = ref.fileSize;
    }

    @Override
    public String toString() {
        return "File Name: " + fileName + ", File Size: " + fileSize + " KB";
    }

}
