package com.oopsworkz.impl;

import com.oopsworkz.internal.DeliveryService;

public class FlipkartDelivery implements DeliveryService {
    public FlipkartDelivery(){
        System.out.println("no-arg Constructor of FlipkartDelivery");
    }
    @Override
    public void delivery() {
        System.out.println("Running delivery in FlipkartDelivery");
    }
}
