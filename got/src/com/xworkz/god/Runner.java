package com.xworkz.god;

import com.xworkz.god.external.NGO;
import com.xworkz.god.internal.Trust;

public class Runner {
    public static void main(String[] args) {
        Trust trust = new Trust();
        trust.fund();
        NGO ngo = new NGO();
        ngo.development();
    }
}
