package ObjectOrientedProgramming.ThisStaticFinal;

/*
 * LibraryBookSystem class
 * -----------------------
 * This class manages library books.
 * It demonstrates static members, final variables,
 * constructor initialization using this, and instanceof.
 */
public class LibraryBookSystem {

    // Static variable shared across all books
    static String libraryName = "Central Library";

    // Final ISBN – unique and immutable
    final String isbn;

    String title;
    String author;

    // Constructor using this keyword
    LibraryBookSystem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method using instanceof
    void displayDetails(Object obj) {
        if (obj instanceof LibraryBookSystem) {
            System.out.println(title + " | " + author + " | " + isbn);
        }
    }

    public static void main(String[] args) {
        LibraryBookSystem book = new LibraryBookSystem("Java", "James", "ISBN123");
        displayLibraryName();
        book.displayDetails(book);
    }
}
