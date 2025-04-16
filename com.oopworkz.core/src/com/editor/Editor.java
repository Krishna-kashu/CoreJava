package com.editor;

public class Editor {
    private String editorName;
    private double version;
    public Editor() {
        System.out.println("no-arg constructor of Editor");
    }

    public void edit() {
        System.out.println("Running edit in Editor");
    }
    public Editor(String editorName, double version) {
        this.editorName = editorName;
        this.version = version;
        System.out.println("String, double constructor of Editor");
    }

    public Editor(Editor ref) {
        this.editorName = ref.editorName;
        this.version = ref.version;
    }

    @Override
    public String toString() {
        return "Editor Name: " + editorName + ", Version: " + version;
    }
}
