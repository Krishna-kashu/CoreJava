package com.oopsworkz.impl;

import com.oopsworkz.internal.Session;

public class OfflineSession implements Session
{
    @Override
    public void attend() {
        System.out.println("Running attend in OfflineClass");
    }
}
