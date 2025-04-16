package com.workshop;

public class Tool {
    private String toolName;
    private String material;
    public Tool() {
        System.out.println("Tool constructor called");
    }

    public void use() {
        System.out.println("Using the tool");
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Tool(Tool ref) {
        this.toolName = ref.toolName;
        this.material = ref.material;
    }

    @Override
    public String toString() {
        return "Tool: " + toolName + ", Material: " + material;
    }

}
