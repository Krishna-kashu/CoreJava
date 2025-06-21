package com.mywork.event.temp;

public class Resource implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("close method");
    }
}
