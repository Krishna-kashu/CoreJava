package Jet.internal;

public class Engineer {
    public Engineer() {
        System.out.println("no-arg constructor for Engineer");
    }

    public void inspectJet() {
        System.out.println("Running inspectJet in Engineer");

        Jet jet = new Jet();

        System.out.println("Model: " + jet.getModel());
        System.out.println("Manufacturer: " + jet.getManufacturer());
        System.out.println("Max Speed: " + jet.getMaxSpeed());
        System.out.println("Stealth Mode: " + jet.isStealth());
        System.out.println("Capacity: " + jet.getCapacity());

        jet.setModel("Su-57");
        jet.setManufacturer("Sukhoi");
        jet.setMaxSpeed(2600.0);
        jet.setStealth(false);
        jet.setCapacity(2);

        System.out.println("Updated Model: " + jet.getModel());
        System.out.println("Updated Manufacturer: " + jet.getManufacturer());
        System.out.println("Updated Max Speed: " + jet.getMaxSpeed());
        System.out.println("Updated Stealth Mode: " + jet.isStealth());
        System.out.println("Updated Capacity: " + jet.getCapacity());
    }
}