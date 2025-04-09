package com.workz;

import com.workz.external.NikeShoe;
import com.workz.internal.BataShoe;

public class ShoeRunner {
    public static void main(String[] args) {
        BataShoe batashoe= new BataShoe();
        batashoe.collection();

        NikeShoe nikeShoe=new NikeShoe();
        nikeShoe.produce();
    }
}
