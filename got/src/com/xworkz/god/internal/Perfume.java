package com.xworkz.god.internal;

import sun.misc.Perf;

public class Perfume {
    public Perfume(){
        System.out.println("no arg const of Perfume");
    }
    public void spray(){
        System.out.println("running spray in Perfume");
    }
    private void mixIngredients(){
        System.out.println("running mixIngredients in Perfume");
    }
    void testFragrance(){
        System.out.println("running testFragrance in Perfume");
    }
}