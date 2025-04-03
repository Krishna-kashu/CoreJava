public class SolarSystemRunner {
    public static void main(String[] args) {

        SolarSystem system0 = new SolarSystem();
        system0.displayInfo();
        SolarSystem system1 = new SolarSystem("Sun");
        system1.displayInfo();
        SolarSystem system2 = new SolarSystem("Sun", 8);
        system2.displayInfo();
        SolarSystem system3 = new SolarSystem("Sun", 8, "Jupiter");
        system3.displayInfo();
        SolarSystem system4 = new SolarSystem("Sun", 8, "Jupiter", "Mercury");
        system4.displayInfo();
        SolarSystem system5 = new SolarSystem("Sun", 8, "Jupiter", "Mercury", 0.0);
        system5.displayInfo();
        SolarSystem system6 = new SolarSystem("Sun", 8, "Jupiter", "Mercury", 0.0, true);
        system6.displayInfo();
        SolarSystem system7 = new SolarSystem("Sun", 8, "Jupiter", "Mercury", 0.0, true, 200);
        system7.displayInfo();
        SolarSystem system8 = new SolarSystem("Sun", 8, "Jupiter", "Mercury", 0.0, true, 200, "Mercury");
        system8.displayInfo();
        SolarSystem system9 = new SolarSystem("Sun", 8, "Jupiter", "Mercury", 0.0, true, 200, "Mercury", 27000);
        system9.displayInfo();
        SolarSystem system10 = new SolarSystem("Sun", 8, "Jupiter", "Mercury", 0.0, true, 200, "Mercury", 27000, true);
        system10.displayInfo();

    }
}
