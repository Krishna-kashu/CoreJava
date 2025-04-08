package com.xworkz.god.internal;

public class Box {
    public Box(){
        System.out.println("no arg const of Box");
    }
    public void open(){
        System.out.println("box is open");
        Coin coin= new Coin();
        coin.flipSide();
        coin.toss();
    }
}
