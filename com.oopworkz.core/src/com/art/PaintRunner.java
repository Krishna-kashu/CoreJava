package com.art;

public class PaintRunner {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.apply();

        Paint paint1 = new SprayPaint();
        paint1.apply();

        System.out.println("**********");

        SprayPaint spray = new SprayPaint();
        spray.apply();
        spray.shakeCan();
    }
}
