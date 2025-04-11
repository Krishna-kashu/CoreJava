package com.notes;

public class DigitalNotebook extends Notebook {
    public DigitalNotebook() {
        System.out.println("Constructor of DigitalNotebook");
    }

    @Override
    public void writeNotes() {
        System.out.println("Typing notes in digital notebook");
    }

    public void syncCloud() {
        System.out.println("Syncing notes to cloud");
    }
}
