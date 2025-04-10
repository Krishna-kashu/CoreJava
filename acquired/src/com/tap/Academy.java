package com.tap;

public class Academy extends Organization {
    public Academy() {
        System.out.println("no-arg constructor of Academy");
    }

    public void train() {
        System.out.println("Running train in Academy");

        Organization organization = new Organization();
        Organization organization1 = new Academy();

        Academy academy = new Academy();
    }
}
