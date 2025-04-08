package com.xworkz.god.internal;

public class Beach {
    public Beach(){
        System.out.println("no arg const of Beach");
    }
    public void open() {
        System.out.println("Beach is open to public.");
    }

    void collectShells() {
        System.out.println("Beach maintenance work.");
    }
    private void cleanShore() {
        System.out.println("Internal Beach matter.");
    }
}
