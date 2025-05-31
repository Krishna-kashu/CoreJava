package com.xworkz.god.internal;

public class Wave {
    public void flow(){
        Beach beach = new Beach();
        beach.collectShells();//package default
        beach.open();//public
        System.out.println("running flow in Wave");
    }
}
