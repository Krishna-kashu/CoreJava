package com.classroom;

public class BoardRunner {
    public static void main(String[] args) {
        Board b = new Board();
        b.clean();

        Board b1 = new WhiteBoard();
        b1.clean();

        System.out.println("**********");

        WhiteBoard wb = new WhiteBoard();
        wb.clean();
        wb.writeWithMarker();
    }
}
