package com.inputdevice;

public class Keyboard  {
    private String type;
    private int keyCount;
    public Keyboard() {
        System.out.println("no-arg constructor of Keyboard");
    }

    public void type() {
        System.out.println("Running type() in Keyboard");
    }

    public Keyboard(String type, int keyCount) {
        this.type = type;
        this.keyCount = keyCount;
        System.out.println("String, int constructor of Keyboard");
    }

    public Keyboard(Keyboard ref) {
        this.type = ref.type;
        this.keyCount = ref.keyCount;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Key Count: " + keyCount;
    }

}
