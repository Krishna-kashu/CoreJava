package com.content;

public class Content {
    private String contentName;
    private String contentType;
    public Content() {
        System.out.println("no-arg constructor of Content");
    }

    public void display() {
        System.out.println("Running display in Content");
    }

    public Content(String contentName, String contentType) {
        this.contentName = contentName;
        this.contentType = contentType;
        System.out.println("String, String constructor of Content");
    }

    public Content(Content ref) {
        this.contentName = ref.contentName;
        this.contentType = ref.contentType;
    }

    @Override
    public String toString() {
        return "Content Name: " + contentName + ", Type: " + contentType;
    }

}
