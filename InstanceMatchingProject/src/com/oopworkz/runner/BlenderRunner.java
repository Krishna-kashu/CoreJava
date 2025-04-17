package com.oopworkz.runner;
import com.oopworkz.setter.Blender;

public class BlenderRunner {
    public static void main(String[] args) {
        Blender b1 = new Blender();
        b1.setModel("ProBlend 1000");
        b1.setPrice(59.99);
        b1.setAutomatic(true);
        b1.setBrand("Ninja");

        Blender b2 = new Blender();
        b2.setModel("UltraMix 700");
        b2.setPrice(79.99);
        b2.setAutomatic(false);
        b2.setBrand("Breville");

        Blender b3 = new Blender();
        b3.setModel("UltraMix 700");
        b3.setPrice(79.99);
        b3.setAutomatic(false);
        b3.setBrand("Breville");

        System.out.println("Blender 1: " + b1);
        System.out.println("Blender 2: " + b2);
        System.out.println("Blender 3: " + b3);

        boolean bMatch = b2.equals(b3);
        boolean bNotMatch = b1.equals(b2);
        System.out.println("Blender match: " + bMatch);
        System.out.println("Blender not match: " + bNotMatch);
    }
}
