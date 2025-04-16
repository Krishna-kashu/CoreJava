package com.toolbox;

public class ToolBoxRunner {
    public static void main(String[] args) {
        ToolBox toolBox = new ToolBox();
        toolBox.activate();

        ToolBox toolBox1 = new Wrench();
        toolBox1.activate();

        System.out.println("**********");

        Wrench wrench = new Wrench();
        wrench.activate();
        wrench.adjustJawWidth();

        ToolBox box1 = new ToolBox();
        box1.setNumberOfTools(10);
        box1.setOwner("Mechanic");

        ToolBox box2 = new ToolBox(box1);
        System.out.println(box2);

    }
}
