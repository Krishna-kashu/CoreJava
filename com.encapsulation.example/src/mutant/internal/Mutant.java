package mutant.internal;

public class Mutant {
    private String type = "Alpha";
    private String skill = "Invisibility";
    private int strength = 80;
    private int speed = 70;
    private boolean active = true;

    public Mutant() {
        System.out.println("no arg constructor for Mutant");
    }

    void setType(String type) {
        this.type = type;
    }

    void setSkill(String skill) {
        this.skill = skill;
    }

    void setStrength(int strength) {
        this.strength = strength;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setActive(boolean active) {
        this.active = active;
    }

    public String getType() {
        return type;
    }

    public String getSkill() {
        return skill;
    }

    public int getStrength() {
        return strength;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isActive() {
        return active;
    }
}
