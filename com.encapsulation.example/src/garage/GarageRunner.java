package garage;

import garage.external.CarOwner;
import garage.internal.Mechanic;

public class GarageRunner {
    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic();
        mechanic.manageGarage();

        System.out.println("--------------------");

        CarOwner carOwner = new CarOwner();
        carOwner.findGarageDetails();
    }
}
