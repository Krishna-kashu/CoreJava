package com.home;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance a = new Appliance();
        a.operate();

        Appliance a1 = new Refrigerator();
        a1.operate();

        System.out.println("**********");

        Refrigerator r = new Refrigerator();
        r.operate();
        r.defrost();
    }
}
