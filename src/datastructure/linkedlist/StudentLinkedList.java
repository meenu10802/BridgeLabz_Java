package datastructure.linkedlist;

/*
1. Singly Linked List: Student Record Management
Problem Statement: Create a program to manage student records using a singly linked list. Each node will store information about a student, including their Roll Number, Name, Age, and Grade. Implement the following operations:
1. Add a new student record at the beginning, end, or at a specific position.
2. Delete a student record by Roll Number.
3. Search for a student record by Roll Number.
4. Display all student records.
5. Update a student's grade based on their Roll Number.
Hint:
● Use a singly linked list where each node contains student information and a pointer to the next node.
● The head of the list will represent the first student, and the last node’s next pointer will be null.
● Update the next pointers when inserting or deleting nodes.
*/

/*
 * Node class
 * Represents one student record in the linked list
 */
class StudentNode {

    int rollNo;
    String name;
    int age;
    String grade;
    StudentNode next;   // Stores address of next node

    // Constructor to initialize student details
    StudentNode(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;   // No next node initially
    }
}

/*
 * Main class that manages the singly linked list
 */
public class StudentLinkedList {

    StudentNode head;   // Head points to the first node

    /*
     * Adds a student record at the end of the list
     */
    void addStudent(int rollNo, String name, int age, String grade) {

        StudentNode newNode = new StudentNode(rollNo, name, age, grade);

        // If list is empty, make new node as head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link last node to new node
        temp.next = newNode;
    }

    /*
     * Deletes a student record using Roll Number
     */
    void deleteStudent(int rollNo) {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If first node is the one to be deleted
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }

        // Traverse to find the node before the target node
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        // If student found, remove it by updating link
        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Student not found");
        }
    }

    /*
     * Searches for a student using Roll Number
     */
    void searchStudent(int rollNo) {

        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                System.out.println(
                        temp.rollNo + " " +
                                temp.name + " " +
                                temp.age + " " +
                                temp.grade
                );
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    /*
     * Updates the grade of a student using Roll Number
     */
    void updateGrade(int rollNo, String newGrade) {

        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    /*
     * Displays all student records
     */
    void display() {

        if (head == null) {
            System.out.println("No records to display");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            System.out.println(
                    temp.rollNo + " " +
                            temp.name + " " +
                            temp.age + " " +
                            temp.grade
            );
            temp = temp.next;
        }
    }

    /*
     * Main method – Program execution starts here
     */
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        // Adding student records
        list.addStudent(101, "Kaviya", 20, "A");
        list.addStudent(102, "Anu", 21, "B");
        list.addStudent(103, "Ravi", 22, "A");

        // Display all students
        list.display();

        // Search for a student
        list.searchStudent(102);

        // Update grade
        list.updateGrade(103, "A+");

        // Delete a student
        list.deleteStudent(101);

        // Display final list
        list.display();
    }
}
