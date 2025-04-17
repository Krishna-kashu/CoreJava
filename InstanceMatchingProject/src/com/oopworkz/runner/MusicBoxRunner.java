package com.oopworkz.runner;
import com.oopworkz.constructor.MusicBox;

public class MusicBoxRunner {
    public static void main(String[] args) {

        MusicBox mb1 = new MusicBox("Fur Elise", "Wood", "Reuge", true);
        MusicBox mb2 = new MusicBox("Swan Lake", "Metal", "Mr. Christmas", false);
        MusicBox mb3 = new MusicBox("Swan Lake", "Metal", "Mr. Christmas", false);

        System.out.println("MusicBox 1: " + mb1);
        System.out.println("MusicBox 2: " + mb2);
        System.out.println("MusicBox 3: " + mb3);

        boolean mbMatch = mb2.equals(mb3);
        boolean mbNotMatch = mb1.equals(mb2);
        System.out.println("MusicBox match: " + mbMatch);
        System.out.println("MusicBox not match: " + mbNotMatch);
    }
}
