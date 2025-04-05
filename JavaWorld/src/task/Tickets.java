package task;

public class Tickets {
    private String ticketCode;
    private String ticketName;
    private double ticketCost;
    private boolean ticketExpired;
    private Movie m[];

    public Tickets(String ticketCode, String ticketName, double ticketCost, boolean ticketExpired, Movie m[]){
        this.ticketCode=ticketCode;
        this.ticketName=ticketName;
        this.ticketCost=ticketCost;
        this.ticketExpired=ticketExpired;
        this.m=m;
    }
    public void ticketInfo(){
        System.out.println("Ticket code: "+ticketCode);
        System.out.println("Ticket name: "+ticketName);
        System.out.println("Ticket cost: "+ticketCost);
        System.out.println("Ticket Expired: "+ticketExpired);

        for(Movie movie:m){
            movie.display();
        }
    }

}
