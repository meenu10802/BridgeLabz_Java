package ObjectOrientedProgramming.Inheritance;

/*
 * BookBase class
 * --------------
 * Superclass representing a generic book.
 * Stores common book details like title and publication year.
 */
class BookBase {
    String title;  // Book title
    int publicationYear;  // Year of publication

    // Constructor to initialize book
    BookBase(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book information
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

/*
 * AuthorDetails class
 * -------------------
 * Subclass extending BookBase with author information.
 * Demonstrates single inheritance.
 */
class AuthorDetails extends BookBase {
    String authorName;  // Name of the author
    String bio;  // Author biography

    // Constructor to initialize book with author details
    AuthorDetails(String title, int year, String authorName, String bio) {
        super(title, year);  // Call parent constructor
        this.authorName = authorName;
        this.bio = bio;
    }

    // Overridden method to include author details
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + authorName);
        System.out.println("Bio: " + bio);
    }

    public static void main(String[] args) {
        // Creating an AuthorDetails object
        AuthorDetails book = new AuthorDetails(
                "Effective Java",
                2018,
                "Joshua Bloch",
                "Java expert and author"
        );

        // Displaying book and author information
        book.displayInfo();
    }
}
