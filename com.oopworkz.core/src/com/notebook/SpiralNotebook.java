package com.notebook;

public class SpiralNotebook extends Notebook {
    public SpiralNotebook() {
        System.out.println("no-arg constructor of SpiralNotebook");
    }

    @Override
    public void write() {
        System.out.println("Running overridden write() in SpiralNotebook");
    }

    void tearPage() {
        System.out.println("Running tearPage() in SpiralNotebook");
    }
}
