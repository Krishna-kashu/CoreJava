package postOffice;

import postOffice.external.Customer;
import postOffice.internal.Admin;

public class PostOfficeRunner {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.updateDetails();

        System.out.println("--------------------");

        Customer customer = new Customer();
        customer.inquireDetails();
    }
}
