package tank.external;

import tank.internal.Tank;

public class PublicViewer {
    public PublicViewer() {
        System.out.println("no-arg constructor for PublicViewer");
    }

    public void display() {
        System.out.println("Running display in PublicViewer");

        Tank tank = new Tank();

        System.out.println("Model: " + tank.getModel());
        System.out.println("Country: " + tank.getCountry());
        System.out.println("Crew: " + tank.getCrew());
        System.out.println("Weight: " + tank.getWeight());
        System.out.println("In Service: " + tank.isInService());
    }
}