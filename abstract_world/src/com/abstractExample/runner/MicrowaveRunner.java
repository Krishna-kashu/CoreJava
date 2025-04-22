package com.abstractExample.runner;

import com.abstractExample.external.Microwave;

public class MicrowaveRunner {
    public static void main(String[] args) {
        Microwave microwave = new Microwave();

        microwave.buy();
        microwave.operate();
    }
}
