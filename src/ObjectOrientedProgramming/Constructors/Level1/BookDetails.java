package ObjectOrientedProgramming.Constructors.Level1;

/*
 * BookDetails class
 * -----------------
 * This class represents a book with title, author, and price.
 * It demonstrates the use of default and parameterized constructors.
 */
public class BookDetails {

    String title;
    String author;
    double price;

    // Default constructor
    BookDetails() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayBook() {
        System.out.println(title + " | " + author + " | " + price);
    }

    public static void main(String[] args) {
        BookDetails b1 = new BookDetails();
        BookDetails b2 = new BookDetails("Java Basics", "James", 499);

        b1.displayBook();
        b2.displayBook();
    }
}
