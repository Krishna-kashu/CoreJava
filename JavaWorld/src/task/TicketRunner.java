package task;

public class TicketRunner {
    public static void main(String[] args) {

        Movie movie = new Movie("Kannada", 2.30);
        Movie movie1 = new Movie("English", 2.45);
        Movie[] mov = {movie, movie1};

        Tickets tickets = new Tickets("12KNTR02", "MovieTicket", 300.45, false, mov);
        tickets.ticketInfo();
    }
}