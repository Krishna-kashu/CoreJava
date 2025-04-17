package com.oopworkz.runner;
import com.oopworkz.constructor.Projector;

public class ProjectorRunner {
    public static void main(String[] args) {

        Projector p1 = new Projector("1080p", 2000, "Epson", true);
        Projector p2 = new Projector("720p", 1500, "BenQ", false);
        Projector p3 = new Projector("720p", 1500, "BenQ", false);

        System.out.println("Projector 1: " + p1);
        System.out.println("Projector 2: " + p2);
        System.out.println("Projector 3: " + p3);

        boolean pMatch = p2.equals(p3);
        boolean pNotMatch = p1.equals(p2);
        System.out.println("Projector match: " + pMatch);
        System.out.println("Projector not match: " + pNotMatch);
    }
}
