package com.home;

public class Refrigerator extends Appliance {
    public Refrigerator() {
        System.out.println("Refrigerator constructor called");
    }

    @Override
    public void operate() {
        System.out.println("Cooling the items inside");
    }

    public void defrost() {
        System.out.println("Defrosting the refrigerator");
    }
}
