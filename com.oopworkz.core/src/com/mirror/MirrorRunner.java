package com.mirror;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirror mirror= new Mirror();
        mirror.reflect();

        Mirror mirror1=new DigitalMirror();
        mirror1.reflect();

        System.out.println("******");

        DigitalMirror  digitalMirror=new DigitalMirror();
        digitalMirror.reflect();
        digitalMirror.connectToApp();

        Mirror mirror2 = new Mirror();
        mirror2.setShape("Round");
        mirror2.setHeight(60.5);

        Mirror mirror3 = new Mirror(mirror2);
        System.out.println(mirror3);

    }
}
