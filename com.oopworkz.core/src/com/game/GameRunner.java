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
        Game game2 = new Game("Chess", 2);
        Game game3 = new Game(game2);
        System.out.println(game3);

    }
}
