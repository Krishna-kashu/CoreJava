package com.game;

public class Game {
    private String gameTitle;
    private int playersRequired;
    public Game() {
        System.out.println("no-arg constructor of Game");
    }

    public void startGame() {
        System.out.println("Running startGame() in Game");
    }


    public Game(String gameTitle, int playersRequired) {
        this.gameTitle = gameTitle;
        this.playersRequired = playersRequired;
        System.out.println("String, int constructor of Game");
    }

    public Game(Game ref) {
        this.gameTitle = ref.gameTitle;
        this.playersRequired = ref.playersRequired;
    }

    @Override
    public String toString() {
        return "Game Title: " + gameTitle + ", Players Required: " + playersRequired;
    }

}
