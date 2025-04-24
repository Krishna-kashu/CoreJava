package com.oopsworkz.impl;

import com.oopsworkz.internal.Class;

public class OfflineClass implements Class
{
    @Override
    public void attend() {
        System.out.println("Running attend in OfflineClass");
    }
}
