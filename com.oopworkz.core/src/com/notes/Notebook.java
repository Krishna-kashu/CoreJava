package com.notes;

public class Notebook {
    private String subject;
    private boolean isRuled;
    public Notebook() {
        System.out.println("Constructor of Notebook");
    }

    public void writeNotes() {
        System.out.println("Writing notes in notebook");
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setIsRuled(boolean isRuled) {
        this.isRuled = isRuled;
    }

    public Notebook(Notebook ref) {
        this.subject = ref.subject;
        this.isRuled = ref.isRuled;
    }

    @Override
    public String toString() {
        return "Subject: " + subject + ", Ruled: " + isRuled;
    }

}
