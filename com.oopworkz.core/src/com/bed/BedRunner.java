package com.bed;

public class BedRunner {
    public static void main(String[] args) {
        Bed bed = new Bed();
        bed.sleep();

        Bed bed1 = new AdjustableBed();
        bed1.sleep();

        System.out.println("**********");

        AdjustableBed abed = new AdjustableBed();
        abed.sleep();
        abed.raiseHead();
        Bed bed2 = new Bed("Queen", "Wood");
        Bed bed3 = new Bed(bed2);
        System.out.println(bed3);
    }
}
