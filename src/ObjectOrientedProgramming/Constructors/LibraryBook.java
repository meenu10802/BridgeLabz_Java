package ObjectOrientedProgramming.Constructors.Level1;

/*
 * LibraryBook class
 * -----------------
 * Demonstrates access modifiers and inheritance.
 */
public class LibraryBook {

    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

// Subclass
class ElectronicBook extends LibraryBook {

    void displayBook() {
        System.out.println(ISBN + " - " + title);
    }
}
