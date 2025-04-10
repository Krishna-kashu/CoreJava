package com.tap;

public class TapRunner {
    public static void main(String[] args) {

        System.out.println("\n-------- Organization  --------");
        Organization org = new Organization();
        org.manage();

        System.out.println("\n-------- Academy  ----------");
        Academy academy = new Academy();
        academy.train();
        academy.manage();

        System.out.println("\n***** Tap  ******");
        Tap tap = new Tap();
        tap.learn();
        tap.train();
        tap.manage();
    }
}
