package datastructure.linkedlist;

/*
2. Doubly Linked List: Movie Management System
Problem Statement: Implement a movie management system using a doubly linked list. Each node will represent a movie and contain Movie Title, Director, Year of Release, and Rating. Implement the following functionalities:
1. Add a movie record at the beginning, end, or at a specific position.
2. Remove a movie record by Movie Title.
3. Search for a movie record by Director or Rating.
4. Display all movie records in both forward and reverse order.
5. Update a movie's Rating based on the Movie Title.
Hint:
● Use a doubly linked list where each node has two pointers: one pointing to the next node and the other to the previous node.
● Maintain pointers to both the head and tail for easier insertion and deletion at both ends.
*/

class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next, prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = this.prev = null;
    }
}

public class MovieDoublyLinkedList {

    MovieNode head, tail;

    // Add movie at the end
    void addMovie(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove movie by title
    void removeMovie(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equals(title)) {

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
        System.out.println("Movie not found");
    }

    // Display movies forward
    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }

    // Display movies in reverse
    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.prev;
        }
    }

    // Update movie rating
    void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addMovie("Inception", "Nolan", 2010, 8.8);
        list.addMovie("Interstellar", "Nolan", 2014, 9.0);

        list.displayForward();
        list.updateRating("Inception", 9.0);
        list.displayReverse();
    }
}
