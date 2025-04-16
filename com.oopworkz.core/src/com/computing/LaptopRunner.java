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
        NotebookComputer notebookComputer = new NotebookComputer("Intel i9", "NVIDIA RTX 3080");
        NotebookComputer notebookComputer1 = new NotebookComputer(notebookComputer);
        System.out.println(notebookComputer1);
    }
}
