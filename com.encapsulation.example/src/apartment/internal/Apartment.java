package apartment.internal;

public class Apartment {
    private String apartmentName = "Green Heights";
    private int numberOfFloors = 10;
    private boolean hasLift = true;
    private String location = "Bangalore";
    private double monthlyRent = 15000.0;

    public Apartment() {
        System.out.println("no-arg constructor for Apartment");
    }

    void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    void setHasLift(boolean hasLift) {
        this.hasLift = hasLift;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isHasLift() {
        return hasLift;
    }

    public String getLocation() {
        return location;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }
}
