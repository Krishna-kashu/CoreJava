package com.oopsworkz.internal;

public class Instagram {
    private JDBC jdbc;

    public Instagram(JDBC jdbc){
        this.jdbc=jdbc;
    }
    public void open(){
        System.out.println("Running open in Instagram");
        if(jdbc!=null){
            this.jdbc.save();
        }else{
            System.out.println("null");
        }
    }
}