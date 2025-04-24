package com.oopsworkz.other;

import com.oopsworkz.internal.DeliveryService;

public class OrderSystem {
    private DeliveryService deliveryService;

    public OrderSystem(DeliveryService deliveryService){
        this.deliveryService=deliveryService;
    }
    public void order(){
        System.out.println("Running order in OrderSystem");
        if(deliveryService!=null){
            this.deliveryService.delivery();
        }else{
            System.out.println("null object");
        }
    }
}
