package com.document;

public class PDFDocument extends Document {
    public PDFDocument() {
        System.out.println("no-arg constructor of PDFDocument");
    }

    @Override
    public void print() {
        System.out.println("Running overridden print() in PDFDocument");
    }

    public void encrypt() {
        System.out.println("Running encrypt() in PDFDocument");
    }
}
