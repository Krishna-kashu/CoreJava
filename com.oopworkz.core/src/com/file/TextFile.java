package com.file;

public class TextFile extends File {
    public TextFile() {
        System.out.println("no-arg constructor of TextFile");
    }

    @Override
    public void open() {
        System.out.println("Running overridden open() in TextFile");
    }

    void countWords() {
        System.out.println("Running countWords() in TextFile");
    }
}
