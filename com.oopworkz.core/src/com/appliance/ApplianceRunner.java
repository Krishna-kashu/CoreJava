package com.appliance;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        appliance.turnOn();

        Appliance appliance1 = new WashingMachine();
        appliance1.turnOn();

        System.out.println("**********");

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.turnOn();
        washingMachine.startWashCycle();
    }
}
