package com.artist;

public class paintRunner {
    public static void main(String[] args) {
        Paint p = new Paint();
        p.apply();

        Paint p1 = new SprayPaint();
        p1.apply();

        System.out.println("**********");

        SprayPaint sp = new SprayPaint();
        sp.apply();
        sp.shakeCan();

        Paint p2 = new Paint("Acrylic", 15);
        Paint p3 = new Paint(p2);
        System.out.println(p3);

    }
}
