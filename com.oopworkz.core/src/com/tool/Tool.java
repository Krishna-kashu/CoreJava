package com.tool;

public class Tool {
    private String toolName;
    private String material;
    public Tool() {
        System.out.println("no-arg constructor of Tool ");
    }

    public void use() {
        System.out.println("Running use method in Tool class");
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
