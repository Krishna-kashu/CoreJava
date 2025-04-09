package Tap;

public class Tap extends Academy {
    public Tap() {
        System.out.println("no-arg constructor of Tap");
    }
    public void learn() {
        System.out.println("Running learn in Tap");

        Organization organization = new Organization();
        Organization organization1 = new Academy();
        Organization organization2 = new Tap();

        Academy academy1 = new Academy();
        Academy academy2 = new Tap();

        Tap tap1 = new Tap();
    }
}
