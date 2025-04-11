package com.website;

public class Blog extends Website {
    public Blog() {
        System.out.println("no-arg constructor of Blog");
    }

    @Override
    public void load() {
        System.out.println("Running overridden load() in Blog");
    }

    void writePost() {
        System.out.println("Running writePost() in Blog");
    }
}