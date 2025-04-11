package xworkz.external;

import xworkz.internal.Generator;

public class Inverter extends Generator {
    public Inverter(){
        System.out.println("no-arg constructor of inverter.");
    }

    @Override
    public void generate() {
        System.out.println("running overridden generate in Generator");
    }
    public void backup(){
        System.out.println("Running backup in Inverter");
    }

}
