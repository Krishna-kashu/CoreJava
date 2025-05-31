package com.xworkz.god.external;

import com.xworkz.god.internal.Perfume;

public class Customer {
    public void purchase(){
        System.out.println("purchase is running in Customer");
        Perfume perfume=new Perfume();
        perfume.spray();
    }
}
