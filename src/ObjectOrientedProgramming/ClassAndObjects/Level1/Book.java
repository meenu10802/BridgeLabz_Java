package ObjectOrientedProgramming.ClassAndObjects.Level1;

/*
 * Book class
 * ----------
 * This class represents a Book.
 * It stores title, author, and price of the book.
 * The class provides a method to display book details.
 */
public class Book {

    String title;
    String author;
    double price;

    // Method to display book information
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book = new Book();

        book.title = "Java Programming";
        book.author = "James Gosling";
        book.price = 499.99;

        book.displayBookDetails();
    }
}
