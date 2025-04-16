package com.bathroom;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirror m = new Mirror();
        m.reflect();

        Mirror m1 = new SmartMirror();
        m1.reflect();

        System.out.println("**********");

        SmartMirror sm = new SmartMirror();
        sm.reflect();
        sm.showNews();
        Mirror m2 = new Mirror("Round", 4.5f);
        Mirror m3 = new Mirror(m2);
        System.out.println(m3);
    }
}
