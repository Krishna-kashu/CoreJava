package com.file;

public class FileRunner {
    public static void main(String[] args) {
        File file = new File();
        file.open();

        File file1 = new TextFile();
        file1.open();

        System.out.println("**********");

        TextFile textFile = new TextFile();
        textFile.open();
        textFile.countWords();
    }
}
