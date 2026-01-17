package ObjectOrientedProgramming.Inheritance;

/*
 * Problem Statement:
 * Write a Java program to demonstrate inheritance
 * using Book and Author classes.
 */

/*
 * Class Name: Book
 *
 * Description:
 * This superclass represents a Book.
 * It stores basic book details such as
 * title and publication year.
 */
class Book {

    // Title of the book
    String title;

    // Year the book was published
    int publicationYear;

    // Constructor to initialize book details
    Book(String title, int publicationYear) {

        // Assign book title
        this.title = title;

        // Assign publication year
        this.publicationYear = publicationYear;
    }
}

/*
 * Class Name: Author
 *
 * Description:
 * This class represents an Author and extends
 * the Book class. It demonstrates inheritance
 * by adding author-specific details.
 */
class Author extends Book {

    // Name of the author
    String name;

    // Short biography of the author
    String bio;

    // Constructor to initialize author and book details
    Author(String title, int publicationYear, String name, String bio) {

        // Call superclass constructor
        super(title, publicationYear);

        // Assign author name
        this.name = name;

        // Assign author biography
        this.bio = bio;
    }

    // Method to display complete book and author information
    void displayInfo() {

        // Display title, publication year, author name, and bio
        System.out.println(title + " " + publicationYear + " " + name + " " + bio);
    }
}
