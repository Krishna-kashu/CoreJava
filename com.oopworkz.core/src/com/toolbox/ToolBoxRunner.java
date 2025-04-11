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
    }
}
