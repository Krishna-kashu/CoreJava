package Apartment.internal;

public class Builder {
    public Builder() {
        System.out.println("no-arg constructor for Builder");
    }

    public void configureApartment() {
        System.out.println("Running configureApartment in Builder");

        Apartment apartment = new Apartment();

        System.out.println("Name: " + apartment.getApartmentName());
        System.out.println("Floors: " + apartment.getNumberOfFloors());
        System.out.println("Lift Available: " + apartment.isHasLift());
        System.out.println("Location: " + apartment.getLocation());
        System.out.println("Rent: " + apartment.getMonthlyRent());

        apartment.setApartmentName("Skyline Residency");
        apartment.setNumberOfFloors(15);
        apartment.setHasLift(false);
        apartment.setLocation("Church Street");
        apartment.setMonthlyRent(18500.0);

        System.out.println("Updated Name: " + apartment.getApartmentName());
        System.out.println("Updated Floors: " + apartment.getNumberOfFloors());
        System.out.println("Updated Lift: " + apartment.isHasLift());
        System.out.println("Updated Location: " + apartment.getLocation());
        System.out.println("Updated Rent: " + apartment.getMonthlyRent());
    }
}