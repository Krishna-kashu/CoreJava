package badge;

import badge.external.Visitor;
import badge.internal.Staff;

public class BadgeRunner {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.assign();
        System.out.println("-*************-");
        Visitor visitor = new Visitor();
        visitor.viewBadge();
    }
}
