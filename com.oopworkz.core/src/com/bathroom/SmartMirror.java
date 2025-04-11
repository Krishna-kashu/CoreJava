package com.bathroom;

public class SmartMirror  extends Mirror {
    public SmartMirror() {
        System.out.println("Constructor of SmartMirror");
    }

    @Override
    public void reflect() {
        System.out.println("Reflecting image and showing weather");
    }

    public void showNews() {
        System.out.println("running  showNews on smart mirror");
    }
}
