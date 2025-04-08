package Apartment.external;
import Apartment.internal.Apartment;
public class Resident {
    public Resident() {
        System.out.println("no-arg constructor for Resident");
    }

    public void viewApartmentDetails() {
        System.out.println("Running viewApartmentDetails in Resident");

        Apartment apartment = new Apartment();

        System.out.println("Name: " + apartment.getApartmentName());
        System.out.println("Floors: " + apartment.getNumberOfFloors());
        System.out.println("Lift Available: " + apartment.isHasLift());
        System.out.println("Location: " + apartment.getLocation());
        System.out.println("Rent: " + apartment.getMonthlyRent());
    }
}
