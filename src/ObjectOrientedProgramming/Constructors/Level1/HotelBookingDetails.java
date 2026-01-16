package ObjectOrientedProgramming.Constructors.Level1;

/*
 * HotelBookingDetails class
 * -------------------------
 * This class models a hotel booking system.
 * It demonstrates default, parameterized, and copy constructors.
 */
public class HotelBookingDetails {

    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBookingDetails() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBookingDetails(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBookingDetails(HotelBookingDetails booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    void displayBooking() {
        System.out.println(guestName + " | " + roomType + " | " + nights);
    }

    public static void main(String[] args) {
        HotelBookingDetails h1 = new HotelBookingDetails();
        HotelBookingDetails h2 = new HotelBookingDetails("Rahul", "Deluxe", 3);
        HotelBookingDetails h3 = new HotelBookingDetails(h2);

        h1.displayBooking();
        h2.displayBooking();
        h3.displayBooking();
    }
}
