package com.notes;

public class NotebookRunner  {
    public static void main(String[] args) {
        Notebook n = new Notebook();
        n.writeNotes();

        Notebook n1 = new DigitalNotebook();
        n1.writeNotes();

        System.out.println("**********");

        DigitalNotebook dn = new DigitalNotebook();
        dn.writeNotes();
        dn.syncCloud();
    }
}
