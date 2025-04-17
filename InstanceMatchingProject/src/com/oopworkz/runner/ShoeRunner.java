package com.oopworkz.runner;
import com.oopworkz.setter.Shoe;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe s1 = new Shoe();
        s1.setSize("9 UK");
        s1.setMaterial("Leather");
        s1.setBrand("Clarks");
        s1.setPrice(120.0);

        Shoe s2 = new Shoe();
        s2.setSize("10 UK");
        s2.setMaterial("Canvas");
        s2.setBrand("Vans");
        s2.setPrice(65.0);

        Shoe s3 = new Shoe();
        s3.setSize("10 UK");
        s3.setMaterial("Canvas");
        s3.setBrand("Vans");
        s3.setPrice(65.0);

        System.out.println("Shoe 1: " + s1);
        System.out.println("Shoe 2: " + s2);
        System.out.println("Shoe 3: " + s3);

        boolean sMatch = s2.equals(s3);
        boolean sNotMatch = s1.equals(s2);
        System.out.println("Shoe match: " + sMatch);
        System.out.println("Shoe not match: " + sNotMatch);
    }
}
