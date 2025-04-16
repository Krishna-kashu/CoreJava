package com.workshop;

public class ToolRunner {
    public static void main(String[] args) {
        Tool t = new Tool();
        t.use();

        Tool t1 = new Drill();
        t1.use();

        System.out.println("**********");

        Drill d = new Drill();
        d.use();
        d.changeBit();

        Tool tool1 = new Tool();
        tool1.setToolName("Screwdriver");
        tool1.setMaterial("Iron");

        Tool tool2 = new Tool(tool1);
        System.out.println(tool2);

    }
}
