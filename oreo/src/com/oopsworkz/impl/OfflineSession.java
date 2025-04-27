package com.oopsworkz.impl;

import com.oopsworkz.internal.Session;

public class OfflineSession implements Session
{
    public OfflineSession(){
        System.out.println("no-arg Constructor of OfflineSession");
    }
    @Override
    public void attend() {
        System.out.println("Running attend in OfflineClass");
    }
}
