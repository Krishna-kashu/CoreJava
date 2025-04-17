package com.oopworkz.runner;
import com.oopworkz.constructor.DigitalFrame;

public class DigitalFrameRunner {
    public static void main(String[] args) {

        DigitalFrame df1 = new DigitalFrame(15.6, "1080p", true, "Nixplay");
        DigitalFrame df2 = new DigitalFrame(10.1, "720p", false, "Aura");
        DigitalFrame df3 = new DigitalFrame(10.1, "720p", false, "Aura");

        System.out.println("DigitalFrame 1: " + df1);
        System.out.println("DigitalFrame 2: " + df2);
        System.out.println("DigitalFrame 3: " + df3);

        boolean dfMatch = df2.equals(df3);
        boolean dfNotMatch = df1.equals(df2);
        System.out.println("DigitalFrame match: " + dfMatch);
        System.out.println("DigitalFrame not match: " + dfNotMatch);
    }
}
