package com.officechair;

public class ChairRunner  {
    public static void main(String[] args) {
        Chair c = new Chair();
        c.sit();

        Chair c1 = new OfficeChair();
        c1.sit();

        System.out.println("**********");

        OfficeChair oc = new OfficeChair();
        oc.sit();
        oc.adjustHeight();

        Chair c2 = new Chair();
        c2.setMaterial("Wood");
        c2.setLegs(4);

        Chair c3 = new Chair(c2);
        System.out.println(c3);

    }
}