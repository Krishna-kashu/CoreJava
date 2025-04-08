package PostOffice.internal;

public class Admin {
    public Admin() {
        System.out.println("no-arg constructor for Admin");
    }

    public void updateDetails() {
        System.out.println("Running updateDetails in Admin");

        PostOffice office = new PostOffice();

        System.out.println("Location: " + office.getLocation());
        System.out.println("Staff Count: " + office.getStaffCount());
        System.out.println("Open: " + office.isOpen());
        System.out.println("Daily Revenue: " + office.getDailyRevenue());
        System.out.println("Head Officer: " + office.getHeadOfficer());

        office.setLocation("Uptown");
        office.setStaffCount(20);
        office.setOpen(false);
        office.setDailyRevenue(3100.50);
        office.setHeadOfficer("Ms. Radha");

        System.out.println("Updated Location: " + office.getLocation());
        System.out.println("Updated Staff Count: " + office.getStaffCount());
        System.out.println("Updated Open: " + office.isOpen());
        System.out.println("Updated Daily Revenue: " + office.getDailyRevenue());
        System.out.println("Updated Head Officer: " + office.getHeadOfficer());
    }
}
