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
        Notebook notebook1 = new Notebook();
        notebook1.setSubject("Physics");
        notebook1.setIsRuled(true);

        Notebook notebook2 = new Notebook(notebook1);
        System.out.println(notebook2);
    }
}
