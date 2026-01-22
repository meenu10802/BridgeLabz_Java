package ObjectOrientedProgramming.ObjectModelling.Level1;

import java.util.ArrayList;

/*
 * BookDetails class
 * -----------------
 * Represents a Book that can exist independently of any Library.
 */
class BookDetails {
    String title;
    String author;

    BookDetails(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

/*
 * LibraryDetails class
 * --------------------
 * Represents a Library that aggregates multiple Book objects.
 * Books can exist outside the library (Aggregation).
 */
class LibraryDetails {

    // Aggregation: Library HAS-A list of Books
    ArrayList<BookDetails> books = new ArrayList<>();

    void addBook(BookDetails book) {
        books.add(book);
    }

    void displayBooks() {
        for (BookDetails b : books) {
            System.out.println(b.title + " by " + b.author);
        }
    }

    public static void main(String[] args) {
        BookDetails b1 = new BookDetails("Java", "James");
        BookDetails b2 = new BookDetails("Python", "Guido");

        LibraryDetails lib1 = new LibraryDetails();
        LibraryDetails lib2 = new LibraryDetails();

        lib1.addBook(b1);
        lib2.addBook(b2);

        lib1.displayBooks();
        lib2.displayBooks();
    }
}
