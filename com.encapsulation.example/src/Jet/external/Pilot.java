package Jet.external;

import Jet.internal.Jet;

public class Pilot {
    public Pilot() {
        System.out.println("no-arg constructor for Pilot");
    }

    public void reviewJetSpecs() {
        System.out.println("Running reviewJetSpecs in Pilot");
        Jet jet = new Jet();
        System.out.println("Model: " + jet.getModel());
        System.out.println("Manufacturer: " + jet.getManufacturer());
        System.out.println("Max Speed: " + jet.getMaxSpeed());
        System.out.println("Stealth Mode: " + jet.isStealth());
        System.out.println("Capacity: " + jet.getCapacity());
    }
}
