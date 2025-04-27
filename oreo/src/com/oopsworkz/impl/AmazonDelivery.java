package com.oopsworkz.impl;

import com.oopsworkz.internal.DeliveryService;

public class AmazonDelivery implements DeliveryService {
    public AmazonDelivery(){
        System.out.println("no-arg const of AmazonDelivery");
    }
    @Override
    public void delivery() {
        System.out.println("Running delivery() in AmazonDelivery");
    }
}
