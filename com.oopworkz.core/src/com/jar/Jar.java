package com.jar;

public class Jar extends Container {
    public Jar() {
        System.out.println("Jar constructor called");
    }

    @Override
    public void fill() {
        System.out.println("Filling the jar with contents");
    }

    public void seal() {
        System.out.println("Sealing the jar");
    }
}
