package datastructure.linkedlist;

/*
5. Doubly Linked List: Library Management System
Problem Statement: Design a library management system using a doubly linked list. Each node represents a book and contains the following attributes: Book Title, Author, Genre, Book ID, and Availability Status. Implement the following functionalities:
1. Add a new book at the beginning, end, or at a specific position.
2. Remove a book by Book ID.
3. Search for a book by Book Title or Author.
4. Update a book’s Availability Status.
5. Display all books in forward and reverse order.
6. Count the total number of books in the library.
Hint:
● Use a doubly linked list with two pointers (next and prev).
*/

class BookNode {
    String title, author, genre;
    int bookId;
    boolean available;
    BookNode next, prev;

    BookNode(int bookId, String title, String author, String genre, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
        this.next = this.prev = null;
    }
}

public class LibraryDoublyLinkedList {

    BookNode head, tail;

    // Add book at end
    void addBook(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove book by ID
    void removeBook(int id) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    // Display forward
    void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " " + temp.author + " " + temp.available);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " " + temp.author + " " + temp.available);
            temp = temp.prev;
        }
    }

    // Count books
    int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addBook(1, "Java", "James", "Programming", true);
        library.addBook(2, "DSA", "Mark", "CS", false);

        library.displayForward();
        System.out.println("Total books: " + library.countBooks());
    }
}
