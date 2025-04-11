package com.inputdevice;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard k = new Keyboard();
        k.type();

        Keyboard k1 = new MechanicalKeyboard();
        k1.type();

        System.out.println("**********");

        MechanicalKeyboard mk = new MechanicalKeyboard();
        mk.type();
        mk.backlight();
    }
}
