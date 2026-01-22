package ObjectOrientedProgramming.Constructors.Level1;

/*
 * LibraryBookDetails class
 * ------------------------
 * This class represents a library book.
 * It allows borrowing if the book is available.
 */
public class LibraryBookDetails {

    String title;
    String author;
    double price;
    boolean available = true;

    // Method to borrow book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    public static void main(String[] args) {
        LibraryBookDetails book = new LibraryBookDetails();
        book.borrowBook();
        book.borrowBook();
    }
}
