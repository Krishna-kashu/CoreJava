package com.document;

public class Document {
    private String documentTitle;
    private int documentSize;
    public Document() {
        System.out.println("no-arg constructor of Document");
    }

    public void print() {
        System.out.println("Running print() in Document");
    }

    public Document(String documentTitle, int documentSize) {
        this.documentTitle = documentTitle;
        this.documentSize = documentSize;
        System.out.println("String, int constructor of Document");
    }

    public Document(Document ref) {
        this.documentTitle = ref.documentTitle;
        this.documentSize = ref.documentSize;
    }

    @Override
    public String toString() {
        return "Document Title: " + documentTitle + ", Size: " + documentSize + " KB";
    }

}