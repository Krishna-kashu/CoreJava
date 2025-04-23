package com.project.interfaces.external.impl;

import com.project.interfaces.internal.rule.Blender;

public class BlenderImpl implements Blender {
    @Override
    public void blend() {
        System.out.println("Running blend in BlenderImpl");
    }

    @Override
    public void pulse() {
        System.out.println("Running pulse in BlenderImpl");
    }

    @Override
    public void clean() {
        System.out.println("Running clean in BlenderImpl");
    }
}
