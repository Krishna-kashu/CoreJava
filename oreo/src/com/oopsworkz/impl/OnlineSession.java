package com.oopsworkz.impl;

import com.oopsworkz.internal.Session;

public class OnlineSession implements Session {
    public OnlineSession(){
        System.out.println("no-arg constructor of OnlineSession");
    }
    @Override
    public void attend() {
        System.out.println("Running attend in OnlineClass");
    }
}
