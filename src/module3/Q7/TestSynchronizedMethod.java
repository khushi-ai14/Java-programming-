package module3.Q7;

    public class TestSynchronizedMethod {
    public static void main(String[] args) {
        TicketBooking bookingSystem = new TicketBooking();

        Thread user1 = new Thread(() -> bookingSystem.bookTicket("User 1"));
        Thread user2 = new Thread(() -> bookingSystem.bookTicket("User 2"));
        Thread user3 = new Thread(() -> bookingSystem.bookTicket("User 3"));
        Thread user4 = new Thread(() -> bookingSystem.bookTicket("User 4"));

        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }  
}
