package com.kitchen;

public class DesignerMug extends Mug {
    public DesignerMug() {
        System.out.println("no-arg constructor of DesignerMug");
    }

    @Override
    public void fill() {
        System.out.println("Running overridden fill() in DesignerMug");
    }

    void design() {
        System.out.println("Running sealLid() in DesignerMug");
    }
}
