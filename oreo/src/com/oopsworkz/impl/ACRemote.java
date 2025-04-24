package com.oopsworkz.impl;

import com.oopsworkz.internal.Remote;

public class ACRemote implements Remote {
    @Override
    public void off() {
        System.out.println("Running off() in ACRemote");
    }
}
