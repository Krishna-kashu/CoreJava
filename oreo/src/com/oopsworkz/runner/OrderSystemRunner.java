package com.oopsworkz.runner;

import com.oopsworkz.impl.AmazonDelivery;
import com.oopsworkz.impl.FlipkartDelivery;
import com.oopsworkz.internal.DeliveryService;
import com.oopsworkz.other.OrderSystem;

public class OrderSystemRunner {
    public static void main(String[] args) {
        DeliveryService deliveryService=new FlipkartDelivery();
        deliveryService.delivery();

        DeliveryService deliveryService1=new AmazonDelivery();
        deliveryService1.delivery();

        OrderSystem orderSystem=new OrderSystem(deliveryService);
        orderSystem.order();
        OrderSystem orderSystem1 =new OrderSystem(deliveryService1);
        orderSystem1.order();
    }
}
