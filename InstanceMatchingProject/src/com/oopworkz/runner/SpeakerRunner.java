package com.oopworkz.runner;
import com.oopworkz.setter.Speaker;

public class SpeakerRunner {
    public static void main(String[] args) {
        Speaker s1 = new Speaker();
        s1.setModel("SonicBoom");
        s1.setPrice(99.99);
        s1.setWireless(true);
        s1.setBrand("Sony");

        Speaker s2 = new Speaker();
        s2.setModel("SoundWave");
        s2.setPrice(149.99);
        s2.setWireless(false);
        s2.setBrand("Bose");

        Speaker s3 = new Speaker();
        s3.setModel("SoundWave");
        s3.setPrice(149.99);
        s3.setWireless(false);
        s3.setBrand("Bose");

        System.out.println("Speaker 1: " + s1);
        System.out.println("Speaker 2: " + s2);
        System.out.println("Speaker 3: " + s3);

        boolean sMatch = s2.equals(s3);
        boolean sNotMatch = s1.equals(s2);
        System.out.println("Speaker match: " + sMatch);
        System.out.println("Speaker not match: " + sNotMatch);
    }
}
