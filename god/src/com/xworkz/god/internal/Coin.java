package com.xworkz.god.internal;

public class Coin {
    public Coin(){
        System.out.println("no arg constructor");
    }
    public void toss(){
        System.out.println("toss running in Coin class");
    }
    private void polish(){
        System.out.println("running polish in coin");
    }
    void flipSide(){
        System.out.println("running flipside in coin");
    }
}
