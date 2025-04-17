package com.oopworkz.runner;
import com.oopworkz.constructor.Notebook;

public class NotebookRunner {
    public static void main(String[] args) {

        Notebook n1 = new Notebook(100, "Spiral", "Moleskine", true);
        Notebook n2 = new Notebook(200, "Hardcover", "Leuchtturm", false);
        Notebook n3 = new Notebook(200, "Hardcover", "Leuchtturm", false);

        System.out.println("Notebook 1: " + n1);
        System.out.println("Notebook 2: " + n2);
        System.out.println("Notebook 3: " + n3);

        boolean nMatch = n2.equals(n3);
        boolean nNotMatch = n1.equals(n2);
        System.out.println("Notebook match: " + nMatch);
        System.out.println("Notebook not match: " + nNotMatch);
    }
}
