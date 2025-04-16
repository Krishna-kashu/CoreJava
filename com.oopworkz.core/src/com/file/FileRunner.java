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
        File file2 = new File("Resume.pdf", 350);
        File file3 = new File(file2);
        System.out.println(file3);

    }
}
