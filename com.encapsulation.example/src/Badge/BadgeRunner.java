package Badge;

import Badge.external.Visitor;
import Badge.internal.Staff;

public class BadgeRunner {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.assign();
        System.out.println("-*************-");
        Visitor visitor = new Visitor();
        visitor.viewBadge();
    }
}
