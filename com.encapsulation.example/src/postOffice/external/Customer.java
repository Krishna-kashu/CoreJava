package postOffice.external;

import postOffice.internal.PostOffice;

public class Customer {
    public Customer() {
        System.out.println("no-arg constructor for Customer");
    }

    public void inquireDetails() {
        System.out.println("Running inquireDetails in Customer");

        PostOffice office = new PostOffice();

        System.out.println("Location: " + office.getLocation());
        System.out.println("Staff Count: " + office.getStaffCount());
        System.out.println("Open: " + office.isOpen());
        System.out.println("Daily Revenue: " + office.getDailyRevenue());
        System.out.println("Head Officer: " + office.getHeadOfficer());
    }
}
