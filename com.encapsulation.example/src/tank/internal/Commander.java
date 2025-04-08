package tank.internal;

public class Commander {
    public Commander() {
        System.out.println("no-arg constructor for Commander");
    }

    public void operate() {
        System.out.println("Running operate in Commander");

        Tank tank = new Tank();

        System.out.println("Model: " + tank.getModel());
        System.out.println("Country: " + tank.getCountry());
        System.out.println("Crew: " + tank.getCrew());
        System.out.println("Weight: " + tank.getWeight());
        System.out.println("In Service: " + tank.isInService());

        tank.setModel("M1");
        tank.setCountry("India");
        tank.setCrew(4);
        tank.setWeight(62.0);
        tank.setInService(false);

        System.out.println("Updated Model: " + tank.getModel());
        System.out.println("Updated Country: " + tank.getCountry());
        System.out.println("Updated Crew: " + tank.getCrew());
        System.out.println("Updated Weight: " + tank.getWeight());
        System.out.println("Updated In Service: " + tank.isInService());
    }
}
