package com.computing;

public class GamingLaptop extends NotebookComputer {
    public GamingLaptop() {
        System.out.println("no-arg constructor of GamingLaptop");
    }

    @Override
    public void boot() {
        System.out.println("Running overridden boot() in GamingLaptop");
    }

    void launchGame() {
        System.out.println("Running launchGame() in GamingLaptop");
    }
}
