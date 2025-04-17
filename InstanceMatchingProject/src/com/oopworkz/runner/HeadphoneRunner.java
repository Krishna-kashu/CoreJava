package com.oopworkz.runner;
import com.oopworkz.setter.Headphone;

public class HeadphoneRunner {
    public static void main(String[] args) {
        Headphone h1 = new Headphone();
        h1.setType("Over-Ear");
        h1.setWireless(true);
        h1.setBatteryLife(30);
        h1.setBrand("Sony");

        Headphone h2 = new Headphone();
        h2.setType("In-Ear");
        h2.setWireless(false);
        h2.setBatteryLife(8);
        h2.setBrand("Apple");

        Headphone h3 = new Headphone();
        h3.setType("In-Ear");
        h3.setWireless(false);
        h3.setBatteryLife(8);
        h3.setBrand("Apple");

        System.out.println("Headphone 1: " + h1);
        System.out.println("Headphone 2: " + h2);
        System.out.println("Headphone 3: " + h3);

        boolean hMatch = h2.equals(h3);
        boolean hNotMatch = h1.equals(h2);
        System.out.println("Headphone match: " + hMatch);
        System.out.println("Headphone not match: " + hNotMatch);
    }
}
