package datastructure.stackandqueue.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/*
Implement a Queue Using Stacks
Problem: Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.
Hint: Use one stack for enqueue and another stack for dequeue. Transfer elements between stacks as needed.
*/

class QueueUsingStacks {

    // Stack used for enqueue
    private Stack<Integer> stack1 = new Stack<>();

    // Stack used for dequeue
    private Stack<Integer> stack2 = new Stack<>();

    // Method to insert element
    void enqueue(int data) {
        stack1.push(data); // Push element into stack1
    }

    // Method to remove element
    int dequeue() {

        // If both stacks are empty
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // Transfer elements if stack2 is empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop(); // Return front element
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QueueUsingStacks queue = new QueueUsingStacks();

        System.out.print("Enter number of elements to enqueue: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            queue.enqueue(sc.nextInt());
        }

        System.out.print("Enter number of elements to dequeue: ");
        int d = sc.nextInt();

        for (int i = 0; i < d; i++) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}
