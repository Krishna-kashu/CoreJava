package Badge.external;
import Badge.internal.Badge;

public class Visitor {
    public Visitor() {
        System.out.println("no-arg constructor for Visitor");
    }

    public void viewBadge() {
        System.out.println("Running viewBadge in Visitor");


        Badge badge = new Badge();

        System.out.println("Name: " + badge.getName());
        System.out.println("Color: " + badge.getColor());
        System.out.println("Level: " + badge.getLevel());
        System.out.println("Issuer: " + badge.getIssuer());
        System.out.println("Valid: " + badge.isValid());
    }
}
