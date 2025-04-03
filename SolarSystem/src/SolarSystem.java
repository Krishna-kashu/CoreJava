public class SolarSystem {
    String starName;
    int numOfPlanets;
    String largestPlanet;
    String smallestPlanet;
    double distanceFromEarth;
    boolean hasAsteroidBelt;
    int numOfMoons;
    String closestPlanet;
    double galaxyDistance;
    boolean hasLife;

    public SolarSystem() {
        System.out.println("Solar System Details");
    }

    public SolarSystem(String starName) {
        System.out.println("*********");
        this.starName = starName;
    }

    public SolarSystem(String starName, int numOfPlanets) {
        this(starName);
        this.numOfPlanets = numOfPlanets;
    }

    public SolarSystem(String starName, int numOfPlanets, String largestPlanet) {
        this(starName, numOfPlanets);
        this.largestPlanet = largestPlanet;
    }

    public SolarSystem(String starName, int numOfPlanets, String largestPlanet, String smallestPlanet) {
        this(starName, numOfPlanets, largestPlanet);
        this.smallestPlanet = smallestPlanet;
    }

    public SolarSystem(String starName, int numOfPlanets, String largestPlanet, String smallestPlanet, double distanceFromEarth) {
        this(starName, numOfPlanets, largestPlanet, smallestPlanet);
        this.distanceFromEarth = distanceFromEarth;
    }

    public SolarSystem(String starName, int numOfPlanets, String largestPlanet, String smallestPlanet, double distanceFromEarth, boolean hasAsteroidBelt) {
        this(starName, numOfPlanets, largestPlanet, smallestPlanet, distanceFromEarth);
        this.hasAsteroidBelt = hasAsteroidBelt;
    }

    public SolarSystem(String starName, int numOfPlanets, String largestPlanet, String smallestPlanet, double distanceFromEarth, boolean hasAsteroidBelt, int numOfMoons) {
        this(starName, numOfPlanets, largestPlanet, smallestPlanet, distanceFromEarth, hasAsteroidBelt);
        this.numOfMoons = numOfMoons;
    }

    public SolarSystem(String starName, int numOfPlanets, String largestPlanet, String smallestPlanet, double distanceFromEarth, boolean hasAsteroidBelt, int numOfMoons, String closestPlanet) {
        this(starName, numOfPlanets, largestPlanet, smallestPlanet, distanceFromEarth, hasAsteroidBelt, numOfMoons);
        this.closestPlanet = closestPlanet;
    }

    public SolarSystem(String starName, int numOfPlanets, String largestPlanet, String smallestPlanet, double distanceFromEarth, boolean hasAsteroidBelt, int numOfMoons, String closestPlanet, double galaxyDistance) {
        this(starName, numOfPlanets, largestPlanet, smallestPlanet, distanceFromEarth, hasAsteroidBelt, numOfMoons, closestPlanet);
        this.galaxyDistance = galaxyDistance;
    }

    public SolarSystem(String starName, int numOfPlanets, String largestPlanet, String smallestPlanet, double distanceFromEarth, boolean hasAsteroidBelt, int numOfMoons, String closestPlanet, double galaxyDistance, boolean hasLife) {
        this(starName, numOfPlanets, largestPlanet, smallestPlanet, distanceFromEarth, hasAsteroidBelt, numOfMoons, closestPlanet, galaxyDistance);
        this.hasLife = hasLife;
    }

    public void displayInfo() {
        System.out.println("Star Name: " + starName);
        System.out.println("Number of Planets: " + numOfPlanets);
        System.out.println("Largest Planet: " + largestPlanet);
        System.out.println("Smallest Planet: " + smallestPlanet);
        System.out.println("Distance from Earth: " + distanceFromEarth + " AU");
        System.out.println("Has Asteroid Belt: " + hasAsteroidBelt);
        System.out.println("Number of Moons: " + numOfMoons);
        System.out.println("Closest Planet: " + closestPlanet);
        System.out.println("Galaxy Distance: " + galaxyDistance + " light-years");
        System.out.println("Has Life: " + hasLife);
    }

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
