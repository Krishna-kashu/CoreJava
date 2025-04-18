package apartment;

import apartment.external.Resident;
import apartment.internal.Builder;

public class ApartmentRunner {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.configureApartment();

        System.out.println("--------------------");

        Resident resident = new Resident();
        resident.viewApartmentDetails();
    }
}