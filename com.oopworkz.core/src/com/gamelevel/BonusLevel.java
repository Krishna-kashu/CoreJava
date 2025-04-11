package com.gamelevel;

public class BonusLevel extends GameLevel {
    public BonusLevel() {
        System.out.println("no-arg constructor of BonusLevel");
    }

    @Override
    public void start() {
        System.out.println("Running overridden start() in BonusLevel");
    }

    void unlockReward() {
        System.out.println("Running unlockReward() in BonusLevel");
    }
}
