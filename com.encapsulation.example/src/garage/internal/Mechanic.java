package garage.internal;

public class Mechanic {
    public Mechanic() {
        System.out.println("no-arg constructor for Mechanic");
    }

    public void manageGarage() {
        System.out.println("Running manageGarage in Mechanic");

        Garage garage = new Garage();

        System.out.println("Name: " + garage.getName());
        System.out.println("Capacity: " + garage.getCapacity());
        System.out.println("Open 24 Hours: " + garage.isOpen24Hours());
        System.out.println("Service Charge: " + garage.getServiceCharge());
        System.out.println("Location: " + garage.getLocation());

        garage.setName("AutoCare");
        garage.setCapacity(30);
        garage.setOpen24Hours(false);
        garage.setServiceCharge(750.0);
        garage.setLocation("City Center");

        System.out.println("Updated Name: " + garage.getName());
        System.out.println("Updated Capacity: " + garage.getCapacity());
        System.out.println("Updated Open 24 Hours: " + garage.isOpen24Hours());
        System.out.println("Updated Service Charge: " + garage.getServiceCharge());
        System.out.println("Updated Location: " + garage.getLocation());
    }
}
