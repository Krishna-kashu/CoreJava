package com.tv;

public class TVRemote extends TV {
    public TVRemote() {
        System.out.println("no-arg constructor of TVRemote");
    }

    @Override
    public void powerOn() {
        System.out.println("Running overridden powerOn in TVRemote");
    }

    void changeChannel() {
        System.out.println("Running changeChannel in TVRemote");
    }
}
