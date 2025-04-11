package com.notebook;

public class NotebookRunner {
    public static void main(String[] args) {
        Notebook nb = new Notebook();
        nb.write();

        Notebook nb1 = new SpiralNotebook();
        nb1.write();

        System.out.println("**********");

        SpiralNotebook spiral = new SpiralNotebook();
        spiral.write();
        spiral.tearPage();
    }
}
