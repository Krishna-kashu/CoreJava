package com.xworkz.god.internal;

public class Church {
    public Church(){
        System.out.println("no arg constructor of Church");
    }
    public void open() {
        System.out.println("\nChurch is open to public.");
        internal();
    }

    void maintain() {
        System.out.println("Church maintenance work.");
    }

    private void internal() {
        System.out.println("Internal Church matter.");
    }
}


