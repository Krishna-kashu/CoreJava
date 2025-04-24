package com.oopsworkz.impl;

import com.oopsworkz.internal.Session;

public class OnlineSession implements Session {
    @Override
    public void attend() {
        System.out.println("Running attend in OnlineClass");
    }
}
