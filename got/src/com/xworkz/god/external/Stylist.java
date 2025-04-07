package com.xworkz.god.external;

import com.xworkz.god.internal.Comb;

public class Stylist {
    public void useComb(){
        System.out.println("running useComb in stylist");
        Comb comb = new Comb();
        comb.untangleHair();
    }
}
