package com.oopsworkz.other;

import com.oopsworkz.internal.Remote;

public class SmartHome {
    private Remote remote;

    public SmartHome(Remote remote){
        this.remote=remote;
    }
    public void on(){
        System.out.println("Running on() in SmartHome");
        if(remote!=null){
            remote.off();
        }
        else{
            System.out.println("ref is null");
        }
    }
}
