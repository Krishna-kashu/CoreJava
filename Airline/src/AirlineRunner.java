

public class AirlineRunner {
    public static void main(String[] args) {
        Airline airline0 = new Airline();
        airline0.displayInfo();
        Airline airline1 = new Airline("Air India");
        airline1.displayInfo();
        Airline airline2 = new Airline("Air India", 101);
        airline2.displayInfo();
        Airline airline3 = new Airline("Air India", 101, "New York");
        airline3.displayInfo();
        Airline airline4 = new Airline("Air India", 101, "New York",  "London");
        airline4.displayInfo();
        Airline airline5 = new Airline("Air India", 101, "New York",  "London", 300);
        airline5.displayInfo();
        Airline airline6 = new Airline("Air India", 101, "New York",  "London", 300, 50);
        airline6.displayInfo();
        Airline airline7 = new Airline("Air India", 101, "New York",  "London",  300,50, 500.00);
        airline7.displayInfo();
        Airline airline8 = new Airline("Air India", 101, "New York",  "London",  300,50, 500.00, "Economy");
        airline8.displayInfo();
        Airline airline9 = new Airline("Air India", 101, "New York",  "London",  300,50, 500.00, "Economy", true);
        airline9.displayInfo();
        Airline airline10 = new Airline("Air India", 101, "New York", "London", 300, 50, 500.00, "Economy", true, "AI101");
        airline10.displayInfo();


    }
}