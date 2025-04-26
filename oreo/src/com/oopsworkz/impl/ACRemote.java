package com.oopsworkz.impl;

import com.oopsworkz.internal.Remote;

public class ACRemote implements Remote {
    public ACRemote(){
        System.out.println("no-arg Constructor of ACRemote");
    }
    @Override
    public void off() {
        System.out.println("Running off() in ACRemote");
    }
}
