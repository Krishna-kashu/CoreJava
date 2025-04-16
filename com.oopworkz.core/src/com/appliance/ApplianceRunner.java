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
        System.out.println("******");
        Appliance app1 = new Appliance("Samsung", 750.5);
        Appliance app2 = new Appliance(app1);
        System.out.println(app2);

    }
}
