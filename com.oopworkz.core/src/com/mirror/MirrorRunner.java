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
    }
}
