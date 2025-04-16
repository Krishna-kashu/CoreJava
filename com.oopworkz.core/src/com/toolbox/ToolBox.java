package com.toolbox;

public class ToolBox {
    private int numberOfTools;
    private String owner;
    public ToolBox() {
        System.out.println("no-arg constructor of Toolbox");
    }

    public void activate() {
        System.out.println("Running activate in Toolbox");
    }

    public void setNumberOfTools(int numberOfTools) {
        this.numberOfTools = numberOfTools;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ToolBox(ToolBox ref) {
        this.numberOfTools = ref.numberOfTools;
        this.owner = ref.owner;
    }

    @Override
    public String toString() {
        return "Tools: " + numberOfTools + ", Owner: " + owner;
    }

}
