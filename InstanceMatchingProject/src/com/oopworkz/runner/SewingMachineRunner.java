package com.oopworkz.runner;
import com.oopworkz.constructor.SewingMachine;

public class SewingMachineRunner {
    public static void main(String[] args) {

        SewingMachine sm1 = new SewingMachine(300, "Direct Drive", "Singer", true);
        SewingMachine sm2 = new SewingMachine(150, "Belt Drive", "Brother", false);
        SewingMachine sm3 = new SewingMachine(150, "Belt Drive", "Brother", false);

        System.out.println("SewingMachine 1: " + sm1);
        System.out.println("SewingMachine 2: " + sm2);
        System.out.println("SewingMachine 3: " + sm3);

        boolean smMatch = sm2.equals(sm3);
        boolean smNotMatch = sm1.equals(sm2);
        System.out.println("SewingMachine match: " + smMatch);
        System.out.println("SewingMachine not match: " + smNotMatch);
    }
}
