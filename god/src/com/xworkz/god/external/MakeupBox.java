package com.xworkz.god.external;

import com.xworkz.god.internal.Powder;

public class MakeupBox {
    public void applyPowder(){
        System.out.println("applyPowder in makeupBox");
        Powder powder= new Powder();
        powder.apply();
    }
}
