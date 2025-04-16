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
        Keyboard keyboard1 = new Keyboard("Mechanical", 104);
        Keyboard keyboard2 = new Keyboard(keyboard1);
        System.out.println(keyboard2);

    }
}
