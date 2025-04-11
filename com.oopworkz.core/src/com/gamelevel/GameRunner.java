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
        }
    }