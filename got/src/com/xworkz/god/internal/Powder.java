package com.xworkz.god.internal;

public class Powder{
    public Powder(){
        System.out.println("no argument constructor of Powder");
    }
    public void apply(){
        System.out.println("running apply in powder");
    }
    private void refillContainer(){
        System.out.println("running refillContainer in powder");
    }
    void spreadEvenly(){
        System.out.println("running spreadEvenly in powder");
    }
}