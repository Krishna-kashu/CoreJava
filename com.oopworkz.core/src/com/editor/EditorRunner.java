package com.editor;

public class EditorRunner {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.edit();

        Editor editor1 = new PhotoEditor();
        editor1.edit();

        System.out.println("**********");

        PhotoEditor photoEditor = new PhotoEditor();
        photoEditor.edit();
        photoEditor.applyFilter();

        Editor editor2 = new Editor("VS Code", 1.7);
        Editor editor3 = new Editor(editor2);
        System.out.println(editor3);

    }
}
