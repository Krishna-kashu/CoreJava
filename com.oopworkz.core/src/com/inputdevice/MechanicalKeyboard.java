package com.inputdevice;

public class MechanicalKeyboard extends Keyboard {
        public MechanicalKeyboard() {
            System.out.println("no-arg constructor of MechanicalKeyboard");
        }

        @Override
        public void type() {
            System.out.println("Running overridden type() in MechanicalKeyboard");
        }

        void backlight() {
            System.out.println("Running backlight() in MechanicalKeyboard");
        }

    }
