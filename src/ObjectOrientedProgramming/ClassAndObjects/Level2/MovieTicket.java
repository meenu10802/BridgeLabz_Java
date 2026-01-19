package ObjectOrientedProgramming.ClassAndObjects.Level2;

/*
 * MovieTicket class
 * -----------------
 * This class models a movie ticket booking system.
 * It stores movie name, seat number, and ticket price.
 */
public class MovieTicket {

    String movieName;
    int seatNumber;
    double price;

    // Method to book a ticket
    void bookTicket(int seat, double ticketPrice) {
        seatNumber = seat;
        price = ticketPrice;
    }

    // Method to display ticket details
    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

        ticket.movieName = "Inception";
        ticket.bookTicket(15, 350);
        ticket.displayTicket();
    }
}
