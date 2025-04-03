public class Airline {
        String airlineName;
        int flightNumber;
        String departure;
        String destination;
        int totalSeats;
        int availableSeats;
        double ticketPrice;
        String flightType;
        boolean isInternational;
        String airlineCode;

        public Airline() {
            System.out.println("Air Line Details");
        }
        public Airline(String airlineName) {
            System.out.println("*********");
            this.airlineName = airlineName;
        }
        public Airline(String airlineName, int flightNumber) {
            this(airlineName);
            this.flightNumber = flightNumber;
        }
        public Airline(String airlineName, int flightNumber, String departure) {
            this(airlineName, flightNumber);
            this.departure = departure;
        }
        public Airline(String airlineName, int flightNumber, String departure, String destination) {
            this(airlineName, flightNumber,departure);
            this.destination = destination;
        }
        public Airline(String airlineName, int flightNumber, String departure, String destination, int totalSeats) {
            this(airlineName, flightNumber, departure, destination);
            this.totalSeats = totalSeats;
        }

        public Airline(String airlineName, int flightNumber, String departure, String destination, int totalSeats, int availableSeats) {
            this(airlineName, flightNumber, departure, destination,totalSeats);
            this.availableSeats = availableSeats;
        }
        public Airline(String airlineName, int flightNumber, String departure, String destination, int totalSeats, int availableSeats, double ticketPrice) {
            this(airlineName, flightNumber, departure, destination, totalSeats, availableSeats);
            this.ticketPrice = ticketPrice;
        }
        public Airline(String airlineName, int flightNumber, String departure, String destination, int totalSeats, int availableSeats, double ticketPrice, String flightType) {
            this(airlineName, flightNumber, departure, destination, totalSeats, availableSeats,ticketPrice);
            this.flightType = flightType;
        }
        public Airline(String airlineName, int flightNumber, String departure, String destination, int totalSeats, int availableSeats, double ticketPrice, String flightType, boolean isInternational) {
            this(airlineName, flightNumber, departure, destination, totalSeats, availableSeats,ticketPrice,flightType);
            this.isInternational = isInternational;

        }
        public Airline(String airlineName, int flightNumber, String departure, String destination, int totalSeats, int availableSeats, double ticketPrice, String flightType, boolean isInternational, String airlineCode) {
            this(airlineName, flightNumber, departure, destination, totalSeats, availableSeats,ticketPrice,flightType, isInternational);
            this.airlineCode = airlineCode;
        }


        public void displayInfo() {
            System.out.println("Airline Name: " + airlineName);
            System.out.println("Flight Number: " + flightNumber);
            System.out.println("Departure: " + departure);
            System.out.println("Destination: " + destination);
            System.out.println("Total Seats: " + totalSeats);
            System.out.println("Available Seats: " + availableSeats);
            System.out.println("Ticket Price: " + ticketPrice);
            System.out.println("Flight Type: " + flightType);
            System.out.println("International: " + isInternational);
            System.out.println("Airline Code: " + airlineCode);
        }
    }

