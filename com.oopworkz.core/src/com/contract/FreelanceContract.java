package com.contract;

public class FreelanceContract extends Contract {
    public FreelanceContract() {
        System.out.println("no-arg constructor of FreelanceContract");
    }

    @Override
    public void sign() {
        System.out.println("Running overridden sign() in FreelanceContract");
    }

    void addDeliverables() {
        System.out.println("Running addDeliverables() in FreelanceContract");
    }
}
