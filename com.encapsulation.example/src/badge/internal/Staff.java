package badge.internal;

public class Staff {
    public Staff() {
        System.out.println("no-arg constructor for Staff");
    }

    public void assign() {
        System.out.println("Running assign in Staff");

        Badge badge = new Badge();

        System.out.println("Name: " + badge.getName());
        System.out.println("Color: " + badge.getColor());
        System.out.println("Level: " + badge.getLevel());
        System.out.println("Issuer: " + badge.getIssuer());
        System.out.println("Valid: " + badge.isValid());

        badge.setName("Top Performer");
        badge.setColor("Silver");
        badge.setLevel(2);
        badge.setIssuer("Manager");
        badge.setValid(false);

        System.out.println("Updated Name: " + badge.getName());
        System.out.println("Updated Color: " + badge.getColor());
        System.out.println("Updated Level: " + badge.getLevel());
        System.out.println("Updated Issuer: " + badge.getIssuer());
        System.out.println("Updated Valid: " + badge.isValid());
    }
}
