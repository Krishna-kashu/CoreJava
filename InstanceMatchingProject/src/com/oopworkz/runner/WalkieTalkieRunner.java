package com.oopworkz.runner;
import com.oopworkz.constructor.WalkieTalkie;

public class WalkieTalkieRunner {
    public static void main(String[] args) {

        WalkieTalkie wt1 = new WalkieTalkie(50, 12, true, "Motorola");
        WalkieTalkie wt2 = new WalkieTalkie(30, 10, false, "Midland");
        WalkieTalkie wt3 = new WalkieTalkie(30, 10, false, "Midland");

        System.out.println("WalkieTalkie 1: " + wt1);
        System.out.println("WalkieTalkie 2: " + wt2);
        System.out.println("WalkieTalkie 3: " + wt3);

        boolean wtMatch = wt2.equals(wt3);
        boolean wtNotMatch = wt1.equals(wt2);
        System.out.println("WalkieTalkie match: " + wtMatch);
        System.out.println("WalkieTalkie not match: " + wtNotMatch);
    }
}