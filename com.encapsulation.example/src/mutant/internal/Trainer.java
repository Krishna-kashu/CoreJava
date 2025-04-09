package mutant.internal;

public class Trainer {

    public Trainer() {
        System.out.println("no-arg constructor of Trainer");
    }

    public void train() {
        System.out.println("Running train in Trainer");

        Mutant mutant = new Mutant();

        System.out.println("Type: " + mutant.getType());
        System.out.println("Skill: " + mutant.getSkill());
        System.out.println("Strength: " + mutant.getStrength());
        System.out.println("Speed: " + mutant.getSpeed());
        System.out.println("Active: " + mutant.getisActive());

        mutant.setType("Beta");
        mutant.setSkill("Teleportation");
        mutant.setStrength(90);
        mutant.setSpeed(95);
        mutant.setActive(false);

        System.out.println("Updated Type: " + mutant.getType());
        System.out.println("Updated Skill: " + mutant.getSkill());
        System.out.println("Updated Strength: " + mutant.getStrength());
        System.out.println("Updated Speed: " + mutant.getSpeed());
        System.out.println("Updated Active: " + mutant.getisActive());
    }
}
