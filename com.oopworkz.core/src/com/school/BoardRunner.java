package com.school;

public class BoardRunner {
    public static void main(String[] args) {
        Board b = new Board();
        b.write();

        Board b1 = new SmartBoard();
        b1.write();

        System.out.println("**********");

        SmartBoard sb = new SmartBoard();
        sb.write();
        sb.connectToWifi();

        Board board = new Board();
        board.setType("Whiteboard");
        board.setWidth(120);
        Board board1 = new Board(board);
        System.out.println(board1);

    }
}
