package com.computing;

public class LaptopRunner {
    public static void main(String[] args) {
        NotebookComputer laptop = new NotebookComputer();
        laptop.boot();

        NotebookComputer laptop1 = new GamingLaptop();
        laptop1.boot();

        System.out.println("**********");

        GamingLaptop gaming = new GamingLaptop();
        gaming.boot();
        gaming.launchGame();
    }
}
