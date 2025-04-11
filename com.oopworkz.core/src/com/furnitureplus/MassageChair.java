package com.furnitureplus;

public class MassageChair extends Chair {
    public MassageChair() {
        System.out.println("Constructor of MassageChair");
    }

    @Override
    public void sit() {
        System.out.println("Sitting on massage chair");
    }

    public void massage() {
        System.out.println("Starting massage feature");
    }
}
