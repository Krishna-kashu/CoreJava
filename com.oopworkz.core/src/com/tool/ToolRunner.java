package com.tool;

public class ToolRunner {
    public static void main(String[] args) {

        Tool tool = new Tool();
        tool.use();

        Tool tool1 = new Hammer();
        tool1.use();

        System.out.println("------");

        Hammer hammer = new Hammer();
        hammer.use();
        hammer.swing();

        Tool tool2 = new Tool();
        tool2.setToolName("Hammer");
        tool2.setMaterial("Steel");

        Tool t = new Tool(tool2);
        System.out.println(t);

    }
}