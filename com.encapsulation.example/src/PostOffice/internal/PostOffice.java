package PostOffice.internal;

public class PostOffice {
    private String location = "Downtown";
    private int staffCount = 15;
    private boolean open = true;
    private double dailyRevenue = 2500.75;
    private String headOfficer = "Mr. Kumar";

    public PostOffice() {
        System.out.println("no-arg constructor for PostOffice");
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    void setOpen(boolean open) {
        this.open = open;
    }

    void setDailyRevenue(double dailyRevenue) {
        this.dailyRevenue = dailyRevenue;
    }

    void setHeadOfficer(String headOfficer) {
        this.headOfficer = headOfficer;
    }

    public String getLocation() {
        return location;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public boolean isOpen() {
        return open;
    }

    public double getDailyRevenue() {
        return dailyRevenue;
    }

    public String getHeadOfficer() {
        return headOfficer;
    }
}
