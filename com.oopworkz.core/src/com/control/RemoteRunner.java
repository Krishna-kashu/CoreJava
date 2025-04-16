package com.control;

public class RemoteRunner {
    public static void main(String[] args) {
        Remote r = new Remote();
        r.pressButton();

        Remote r1 = new SmartRemote();
        r1.pressButton();

        System.out.println("**********");

        SmartRemote sr = new SmartRemote();
        sr.pressButton();
        sr.voiceControl();
        Remote remote1 = new Remote("Infrared", 10);
        Remote remote2 = new Remote(remote1);
        System.out.println(remote2);
    }
}
