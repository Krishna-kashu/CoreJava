package com.oopworkz.runner;
import com.oopworkz.setter.Television;

public class TelevisionRunner {
    public static void main(String[] args) {
        Television t1 = new Television();
        t1.setModel("QLED");
        t1.setResolution("4K");
        t1.setSmart(true);
        t1.setBrand("Samsung");

        Television t2 = new Television();
        t2.setModel("OLED");
        t2.setResolution("1080p");
        t2.setSmart(false);
        t2.setBrand("Sun Direct");

        Television t3 = new Television();
        t3.setModel("OLED");
        t3.setResolution("1080p");
        t3.setSmart(false);
        t3.setBrand("Sun Direct");

        System.out.println("Television 1: " + t1);
        System.out.println("Television 2: " + t2);
        System.out.println("Television 3: " + t3);

        boolean tMatch = t2.equals(t3);
        boolean tNotMatch = t1.equals(t2);
        System.out.println("televison match");
        System.out.println("televison not match");

    }
}