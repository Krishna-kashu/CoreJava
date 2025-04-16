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
        Notebook note1 = new Notebook();
        note1.setBrand("Classmate");
        note1.setNumberOfPages(200);

        Notebook note2 = new Notebook(note1);
        System.out.println(note2);

    }
}
