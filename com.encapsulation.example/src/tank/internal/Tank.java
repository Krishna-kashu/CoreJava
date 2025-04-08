package tank.internal;

public class Tank {
    private String model = "T-90";
    private String country = "India";
    private int crew = 3;
    private double weight = 46.5;
    private boolean inService = true;

    public Tank() {
        System.out.println("no-arg constructor for Tank");
    }

    void setModel(String model) {
        this.model = model;
    }

    void setCountry(String country) {
        this.country = country;
    }

    void setCrew(int crew) {
        this.crew = crew;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    void setInService(boolean inService) {
        this.inService = inService;
    }

    public String getModel() {
        return model;
    }

    public String getCountry() {
        return country;
    }

    public int getCrew() {
        return crew;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isInService() {
        return inService;
    }
}
