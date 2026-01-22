package datastructure.linkedlist;

/*
9. Circular Linked List: Online Ticket Reservation System
Problem Statement: Design an online ticket reservation system using a circular linked list.
*/

class TicketNode {
    int ticketId;
    String customerName, movieName;
    TicketNode next;

    TicketNode(int id, String cust, String movie) {
        ticketId = id;
        customerName = cust;
        movieName = movie;
        next = null;
    }
}

public class TicketReservationSystem {

    TicketNode head = null;

    // Add ticket
    void addTicket(int id, String cust, String movie) {
        TicketNode newNode = new TicketNode(id, cust, movie);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    // Display tickets
    void displayTickets() {
        if (head == null) return;

        TicketNode temp = head;
        do {
            System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TicketReservationSystem trs = new TicketReservationSystem();

        trs.addTicket(1, "Kaviya", "Avatar");
        trs.addTicket(2, "Anu", "Inception");

        trs.displayTickets();
    }
}
