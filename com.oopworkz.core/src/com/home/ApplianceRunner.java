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
        System.out.println("**********");
        Appliance appliance1 = new Appliance("Samsung", 1200.5);
        Appliance appliance2 = new Appliance(appliance1);
        System.out.println(appliance2);

    }
}
