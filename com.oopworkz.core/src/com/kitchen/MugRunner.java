package com.kitchen;

public class MugRunner {
    public static void main(String[] args) {
        Mug mug = new Mug();
        mug.fill();

        Mug mug1 = new DesignerMug();
        mug1.fill();

        System.out.println("**********");

        DesignerMug designerMug = new DesignerMug();
        designerMug.fill();
        designerMug.design();
    }
}
