package com.xworkz.god.internal;

public class Hair {
    public void fall(){
        System.out.println("running fall in hair");
        Comb comb = new Comb();
        comb.checkMissingTeeth();
        comb.untangleHair();
    }
}
