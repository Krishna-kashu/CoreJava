package com.project.interfaces.runner;

import com.project.interfaces.external.impl.Laptop;
import com.project.interfaces.internal.rule.Gadget;

public class GadgetRunner {
    public static void main(String[] args) {
        Gadget gadget=new Laptop();
        gadget.portable();
    }
}
