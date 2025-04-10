package com.game;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();

        Game game1 = new BoardGame();
        game1.startGame();

        System.out.println("**********");

        BoardGame boardGame = new BoardGame();
        boardGame.startGame();
        boardGame.rollDice();
    }
}
