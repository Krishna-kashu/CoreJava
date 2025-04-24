package com.oopsworkz.impl;

import com.oopsworkz.internal.Remote;

public class TVRemote implements Remote {
    @Override
    public void off() {
        System.out.println("Running off() in TVRemote");
    }
}
