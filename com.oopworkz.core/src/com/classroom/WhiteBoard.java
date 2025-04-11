package com.classroom;

public class WhiteBoard extends Board {
    public WhiteBoard() {
        System.out.println("no-arg constructor of WhiteBoard");
    }

    @Override
    public void clean() {
        System.out.println("Running overridden clean() in WhiteBoard");
    }

    void writeWithMarker() {
        System.out.println("Running writeWithMarker() in WhiteBoard");
    }
}
