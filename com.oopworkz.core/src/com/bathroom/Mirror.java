package com.bathroom;

public class Mirror {
    private String shape;
    private float height;
    public Mirror() {
        System.out.println("no-arg Constructor of Mirror");
    }

    public void reflect() {
        System.out.println("Reflect in image");
    }
    public Mirror(String shape, float height) {
        this.shape = shape;
        this.height = height;
        System.out.println("String, float constructor of Mirror");
    }

    public Mirror(Mirror ref) {
        this.shape = ref.shape;
        this.height = ref.height;
    }

    @Override
    public String toString() {
        return "Mirror shape: " + shape + ", Height: " + height + " ft";
    }
}
