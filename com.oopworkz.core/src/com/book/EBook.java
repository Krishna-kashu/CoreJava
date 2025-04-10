package com.book;

public class EBook extends Book{
    public EBook(){
        System.out.println("no-arg const. of EBook");
    }
    @Override
    public void read(){
        System.out.println("running overridden read in EBook");
    }
    void download(){
        System.out.println("running download in EBook");
    }
}
