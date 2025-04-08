package gym.internal;

public class Gym {
    private String gymName = "FitZone";
    private String location = "Downtown";
    private int numberOfTrainers = 5;
    private boolean openOnWeekends = true;
    private double monthlyFee = 1200.0;

    public Gym() {
        System.out.println("no-arg constructor for Gym");
    }

    void setGymName(String gymName) {
        this.gymName = gymName;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setNumberOfTrainers(int numberOfTrainers) {
        this.numberOfTrainers = numberOfTrainers;
    }

    void setOpenOnWeekends(boolean openOnWeekends) {
        this.openOnWeekends = openOnWeekends;
    }

    void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getGymName() {
        return gymName;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfTrainers() {
        return numberOfTrainers;
    }

    public boolean isOpenOnWeekends() {
        return openOnWeekends;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }
}
