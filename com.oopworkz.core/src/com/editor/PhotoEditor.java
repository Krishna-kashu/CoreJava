package com.editor;

public class PhotoEditor extends Editor {
    public PhotoEditor() {
        System.out.println("no-arg constructor of PhotoEditor");
    }

    @Override
    public void edit() {
        System.out.println("Running overridden edit() in PhotoEditor");
    }

    void applyFilter() {
        System.out.println("Running applyFilter() in PhotoEditor");
    }
}
