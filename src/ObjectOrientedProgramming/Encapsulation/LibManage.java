package object_oriented_programming.Encapsulation;

/*
 * Problem Statement:
 * Write a Java program to demonstrate encapsulation, abstraction,
 * inheritance, interfaces, and polymorphism using a
 * library management system.
 */

/*
 * Interface Name: Reservable
 *
 * Description:
 * This interface defines reservation-related behaviors
 * that can be implemented by library items.
 */
interface Reservable {

    // Method to reserve a library item
    void reserveItem();

    // Method to check item availability
    boolean checkAvailability();
}

/*
 * Abstract Class Name: LibraryItem
 *
 * Description:
 * This abstract class represents a generic library item.
 * It demonstrates encapsulation using private variables
 * and abstraction using an abstract method.
 */
abstract class LibraryItem {

    // Unique identifier for the library item
    private int itemId;

    // Title of the library item
    private String title;

    // Author of the library item
    private String author;

    // Constructor to initialize library item details
    LibraryItem(int id, String title, String author) {

        // Assign item ID
        this.itemId = id;

        // Assign item title
        this.title = title;

        // Assign item author
        this.author = author;
    }

    // Abstract method to define loan duration
    abstract int getLoanDuration();

    // Method to display item details
    void getItemDetails() {

        // Display title and author
        System.out.println(title + " by " + author);
    }
}

/*
 * Class Name: Book
 *
 * Description:
 * This class represents a Book in the library.
 * It extends the LibraryItem abstract class and
 * provides the loan duration for books.
 */
class Book extends LibraryItem {

    // Constructor to initialize book details
    Book(int id, String t, String a) {

        // Call superclass constructor
        super(id, t, a);
    }

    // Implementation of loan duration for books
    int getLoanDuration() {

        // Books can be borrowed for 14 days
        return 14;
    }
}

/*
 * Class Name: LibManage
 *
 * Description:
 * This class contains the main method and demonstrates
 * polymorphism by referring to a Book object using
 * a LibraryItem reference.
 */
public class LibManage {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating Book object using LibraryItem reference
        LibraryItem item = new Book(1, "1984", "Orwell");

        // Calling method to display library item details
        item.getItemDetails();
    }
}
