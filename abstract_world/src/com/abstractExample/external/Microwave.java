package com.abstractExample.external;

import com.abstractExample.internal.Appliance;

public class Microwave extends Appliance {

    @Override
    public void operate() {
        System.out.println("Operating the Microwave");
    }

    @Override
    public void buy() {
        super.buy();
        System.out.println("Running buy in Microwave");
    }
}
