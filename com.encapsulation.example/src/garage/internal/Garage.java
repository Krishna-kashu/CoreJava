package garage.internal;

public class Garage {
    private String name = "SpeedFix Garage";
    private int capacity = 25;
    private boolean open24Hours = true;
    private double serviceCharge = 500.0;
    private String location = "Industrial Area";

    public Garage() {
        System.out.println("no-arg constructor for Garage");
    }

    void setName(String name) {
        this.name = name;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void setOpen24Hours(boolean open24Hours) {
        this.open24Hours = open24Hours;
    }

    void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isOpen24Hours() {
        return open24Hours;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public String getLocation() {
        return location;
    }
}
