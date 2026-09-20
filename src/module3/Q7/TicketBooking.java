package module3.Q7;

public class TicketBooking {
    int availableTickets = 3;

    public synchronized void bookTicket(String name) {

        if (availableTickets > 0) {
            System.out.println(name + " booked a ticket successfully.");
            availableTickets--;
            
            System.out.println("Tickets remaining: " + availableTickets);
        }
        else {
            System.out.println(name + " failed to book. Sold out!");
        }
    }
    
}
