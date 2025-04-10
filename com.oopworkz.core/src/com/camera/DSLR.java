package com.camera;

public class DSLR extends Camera {
    public DSLR() {
        System.out.println("no-arg constructor of DSLR");
    }

    @Override
    public void takePhoto() {
        System.out.println("Running overridden takePhoto() in DSLR");
    }

    void changeLens() {
        System.out.println("Running changeLens() in DSLR");
    }
}
