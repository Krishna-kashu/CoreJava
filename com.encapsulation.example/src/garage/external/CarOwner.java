package garage.external;

import garage.internal.Garage;

public class CarOwner {
    public CarOwner() {
        System.out.println("no-arg constructor for CarOwner");
    }

    public void findGarageDetails() {
        System.out.println("Running findGarageDetails in CarOwner");

        Garage garage = new Garage();

        System.out.println("Name: " + garage.getName());
        System.out.println("Capacity: " + garage.getCapacity());
        System.out.println("Open 24 Hours: " + garage.isOpen24Hours());
        System.out.println("Service Charge: " + garage.getServiceCharge());
        System.out.println("Location: " + garage.getLocation());
    }
}
