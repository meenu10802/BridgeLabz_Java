package ObjectOrientedProgramming.Encapsulation;

/*
5. Library Management System
Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
*/

/*
 * Reservable interface
 * --------------------
 * Defines contract for item reservation.
 */
interface Reservable {
    // Method to reserve an item
    void reserveItem();
    // Method to check availability
    boolean checkAvailability();
}

/*
 * LibraryItem abstract class
 * --------------------------
 * Abstract superclass representing a library item.
 * Uses encapsulation to protect item details.
 */
abstract class LibraryItem {
    // Private: Item details are protected
    private int itemId;
    private String title;
    private String author;

    // Constructor to initialize library item
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method for loan duration
    abstract int getLoanDuration();

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("--------------------------------");
    }
}

/*
 * Book class
 * ----------
 * Represents a Book with 14-day loan duration.
 * Implements Reservable interface.
 */
class Book extends LibraryItem implements Reservable {
    // Availability status of the book
    private boolean available = true;

    // Constructor to initialize book
    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    // Loan duration for books: 14 days
    @Override
    int getLoanDuration() {
        return 14;
    }

    // Reserve the book
    public void reserveItem() {
        available = false;
    }

    // Check availability of book
    public boolean checkAvailability() {
        return available;
    }
}

/*
 * Magazine class
 * --------------
 * Represents a Magazine with 7-day loan duration.
 */
class Magazine extends LibraryItem {
    // Constructor to initialize magazine
    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    // Loan duration for magazines: 7 days
    @Override
    int getLoanDuration() {
        return 7;
    }
}

/*
 * DVD class
 * ---------
 * Represents a DVD with 3-day loan duration.
 */
class DVD extends LibraryItem {
    // Constructor to initialize DVD
    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    // Loan duration for DVDs: 3 days
    @Override
    int getLoanDuration() {
        return 3;
    }
}

/*
 * LibraryManagementSystem class
 * -----------------------------
 * Main class demonstrating polymorphism with different library items.
 */
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating array of library items using parent reference (Polymorphism)
        LibraryItem[] items = {
                new Book(1, "Java Programming", "James"),
                new Magazine(2, "Tech World", "Editorial"),
                new DVD(3, "Java Tutorial", "Oracle")
        };

        // Loop to display details of all items
        for (LibraryItem item : items) {
            item.getItemDetails();
        }
    }
}
