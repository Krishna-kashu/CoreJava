package com.oopsworkz.impl;

import com.oopsworkz.internal.DeliveryService;

public class FlipkartDelivery implements DeliveryService {
    @Override
    public void delivery() {
        System.out.println("Running delivery in FlipkartDelivery");
    }
}
