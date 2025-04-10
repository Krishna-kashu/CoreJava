package com.document;

public class DocumentRunner {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();

        Document doc1 = new PDFDocument();
        doc1.print();

        System.out.println("**********");

        PDFDocument pdf = new PDFDocument();
        pdf.print();
        pdf.encrypt();
    }
}
