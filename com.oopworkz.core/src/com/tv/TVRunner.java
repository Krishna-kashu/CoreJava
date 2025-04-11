package com.tv;

public class TVRunner{
    public static void main(String[] args) {
        TV tv = new TV();
        tv.powerOn();

        TV tv1 = new TVRemote();
        tv1.powerOn();

        System.out.println("**********");

        TVRemote remote = new TVRemote();
        remote.powerOn();
        remote.changeChannel();
    }
}
