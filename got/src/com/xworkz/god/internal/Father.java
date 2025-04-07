package com.xworkz.god.internal;

public class Father {
    public void guides() {
        System.out.println("\nrunning guides method in father class");
        Church church = new Church();
        church.open();
        church.maintain();
        //internal not available bcz its private
    }
}
