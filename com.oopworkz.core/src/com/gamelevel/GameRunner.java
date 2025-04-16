package com.gamelevel;

public class GameRunner {
        public static void main(String[] args) {
            GameLevel level = new GameLevel();
            level.start();

            GameLevel level1 = new BonusLevel();
            level1.start();

            System.out.println("**********");

            BonusLevel bonus = new BonusLevel();
            bonus.start();
            bonus.unlockReward();

            GameLevel level2 = new GameLevel("Boss Fight", 9.5);
            GameLevel level3 = new GameLevel(level2);
            System.out.println(level3);

        }
    }