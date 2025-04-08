package mutant.external;

import mutant.internal.Mutant;
import mutant.internal.Trainer;

public class Observer {
    public Observer() {
        System.out.println("no-arg constructor for Observer");
    }

    public void view() {
        System.out.println("Running view in Observer");

        Mutant mutant = new Mutant();

        System.out.println("Type: " + mutant.getType());
        System.out.println("Skill: " + mutant.getSkill());
        System.out.println("Strength: " + mutant.getStrength());
        System.out.println("Speed: " + mutant.getSpeed());
        System.out.println("Active: " + mutant.isActive());
    }
}
