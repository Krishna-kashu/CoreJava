package com.xworkz.god.internal;

public class PowderBox {
    public void shake(){
        System.out.println("running shake in PowderBox");
        Powder powder= new Powder();
        powder.apply();
        powder.spreadEvenly();
    }
}
