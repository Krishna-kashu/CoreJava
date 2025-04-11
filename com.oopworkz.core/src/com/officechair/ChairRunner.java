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
    }
}