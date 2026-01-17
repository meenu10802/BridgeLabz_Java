package object_oriented_programming.ObjectModelling;

import java.util.ArrayList;

/*
 * Problem Statement:
 * Write a Java program to demonstrate Object Modelling
 * using Library and Books classes to show aggregation,
 * where a library can contain multiple books.
 */

/*
 * Class Name: Books
 *
 * Description:
 * This class represents a Book entity.
 * Books can exist independently of a Library,
 * demonstrating aggregation.
 */
class Books {

    // Title of the book
    private String title;

    // Author of the book
    private String author;

    // Constructor to initialize book details
    Books(String title, String author) {

        // Assign book title
        this.title = title;

        // Assign author name
        this.author = author;
    }

    // Method to display book details
    public void displayBook() {

        // Display book title and author
        System.out.println("Book Title: " + title + " | Written By: " + author);
    }
}

/*
 * Class Name: Library
 *
 * Description:
 * This class represents a Library.
 * A library aggregates multiple books,
 * but books can exist independently.
 */
class Library {

    // Name of the library
    private String libName;

    // List of books in the library
    private ArrayList<Books> books;

    // Constructor to initialize library details
    Library(String libName) {

        // Assign library name
        this.libName = libName;

        // Initialize book list
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBooks(Books book) {

        // Add book to library collection
        books.add(book);
    }

    // Method to display library details and books
    public void displayLibrary() {

        // Display library name
        System.out.println("Library Name: " + libName);

        // Display heading
        System.out.println("Books in this library:");

        // Display all books in the library
        for (Books b : books) {
            b.displayBook();
        }

        System.out.println();
    }
}

/*
 * Class Name: LibraryBooksAggregator
 *
 * Description:
 * This class contains the main method and demonstrates
 * aggregation between Library and Books objects.
 */
public class LibraryBooksAggregator {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating Book objects
        Books b1 = new Books("The Alchemist", "Paulo Coelho");
        Books b2 = new Books("Clean Code", "Robert C. Martin");
        Books b3 = new Books("1984", "George Orwell");

        // Creating Library objects
        Library lib1 = new Library("Anna Centenary Library");
        Library lib2 = new Library("Eswari Lending Library");

        // Adding books to libraries
        lib1.addBooks(b1);
        lib2.addBooks(b2);
        lib2.addBooks(b3);

        // Display library details
        lib1.displayLibrary();
        lib2.displayLibrary();
    }
}
