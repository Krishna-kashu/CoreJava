package com.oopworkz.runner;
import com.oopworkz.setter.CeilingFan;

public class CeilingFanRunner {
    public static void main(String[] args) {
        CeilingFan f1 = new CeilingFan();
        f1.setSpeedLevels(3);
        f1.setBladeSpan(52.0);
        f1.setHasRemote(true);
        f1.setBrand("Havells");

        CeilingFan f2 = new CeilingFan();
        f2.setSpeedLevels(5);
        f2.setBladeSpan(48.0);
        f2.setHasRemote(false);
        f2.setBrand("Usha");

        CeilingFan f3 = new CeilingFan();
        f3.setSpeedLevels(5);
        f3.setBladeSpan(48.0);
        f3.setHasRemote(false);
        f3.setBrand("Usha");

        System.out.println("CeilingFan 1: " + f1);
        System.out.println("CeilingFan 2: " + f2);
        System.out.println("CeilingFan 3: " + f3);

        boolean fMatch = f2.equals(f3);
        boolean fNotMatch = f1.equals(f2);
        System.out.println("CeilingFan match: " + fMatch);
        System.out.println("CeilingFan not match: " + fNotMatch);
    }
}
