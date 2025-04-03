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
        System.out.println("Distance from Earth: " + distanceFromEarth);
        System.out.println("Has Asteroid Belt: " + hasAsteroidBelt);
        System.out.println("Number of Moons: " + numOfMoons);
        System.out.println("Closest Planet: " + closestPlanet);
        System.out.println("Galaxy Distance: " + galaxyDistance + " light years");
        System.out.println("Has Life: " + hasLife);
    }

}
