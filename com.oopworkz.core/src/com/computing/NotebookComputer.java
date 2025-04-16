package com.computing;

public class NotebookComputer {
    private String processorType;
    private String gpu;
    public NotebookComputer() {
        System.out.println("no-arg constructor of NotebookComputer");
    }

    public void boot() {
        System.out.println("Running boot() in NotebookComputer");
    }
    public NotebookComputer(String processorType, String gpu) {
        this.processorType = processorType;
        this.gpu = gpu;
        System.out.println("String, String constructor of NotebookComputer");
    }

    public NotebookComputer(NotebookComputer notebookComputer) {
        this.processorType = notebookComputer.processorType;
        this.gpu = notebookComputer.gpu;
    }

    @Override
    public String toString() {
        return "Processor: " + processorType + ", GPU: " + gpu;
    }
}
