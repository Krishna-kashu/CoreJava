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
        Mug mug2 = new Mug();
        mug2.setColor("Red");
        mug2.setCapacityMl(350);

        Mug mug3 = new Mug(mug2);
        System.out.println(mug3);

    }
}
