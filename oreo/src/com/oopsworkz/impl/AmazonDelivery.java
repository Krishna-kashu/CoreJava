package com.oopsworkz.impl;

import com.oopsworkz.internal.DeliveryService;

public class AmazonDelivery implements DeliveryService {
    @Override
    public void delivery() {
        System.out.println("Running delivery() in AmazonDelivery");
    }
}
