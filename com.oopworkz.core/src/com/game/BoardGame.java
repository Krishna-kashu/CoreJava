package com.game;

public class BoardGame extends Game {
    public BoardGame() {
        System.out.println("no-arg constructor of BoardGame");
    }

    @Override
    public void startGame() {
        System.out.println("Running overridden startGame() in BoardGame");
    }

    void rollDice() {
        System.out.println("Running rollDice() in BoardGame");
    }
}
