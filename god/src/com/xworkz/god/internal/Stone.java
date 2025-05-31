package com.xworkz.god.internal;

public class Stone {
    public void shine(){
        System.out.println("running shine in Stone");
        Shell shell = new Shell();
        shell.identifyType();
        shell.listenSound();
    }
}
