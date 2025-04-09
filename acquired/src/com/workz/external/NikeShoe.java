package com.workz.external;

import com.workz.internal.BataShoe;
import com.workz.internal.Shoe;

public class NikeShoe extends Shoe {
    public NikeShoe(){
        System.out.println("no- arg constructor of NikeShoe");
    }
    public void produce(){
        System.out.println("running produce in NikeShoe");
        //Shoe shoe1= new Shoe(); //protected
        Shoe shoe = new BataShoe();

    }
}
