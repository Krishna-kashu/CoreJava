package com.gamelevel;

public class GameLevel {
    private String levelName;
    private double difficultyRating;
    public GameLevel() {
        System.out.println("no-arg constructor of GameLevel");
    }

    public void start() {
        System.out.println("Running start() in GameLevel");
    }


    public GameLevel(String levelName, double difficultyRating) {
        this.levelName = levelName;
        this.difficultyRating = difficultyRating;
        System.out.println("String, double constructor of GameLevel");
    }

    public GameLevel(GameLevel ref) {
        this.levelName = ref.levelName;
        this.difficultyRating = ref.difficultyRating;
    }

    @Override
    public String toString() {
        return "Level Name: " + levelName + ", Difficulty: " + difficultyRating;
    }

}
