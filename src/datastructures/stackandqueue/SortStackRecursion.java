package datastructure.stackandqueue.stackqueue;

import java.util.Scanner;
import java.util.Stack;

/*
Sort a Stack Using Recursion
Problem: Given a stack, sort its elements in ascending order using recursion.
Hint: Pop elements recursively, sort the remaining stack, and insert the popped element back at the correct position.
*/

class SortStackRecursion {

    static void sortStack(Stack<Integer> stack) {

        // Base case
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop(); // Remove top element
        sortStack(stack);      // Recursive call
        insertSorted(stack, top); // Insert in sorted order
    }

    static void insertSorted(Stack<Integer> stack, int element) {

        // Insert when correct position is found
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int top = stack.pop();       // Remove top
        insertSorted(stack, element); // Recursive call
        stack.push(top);             // Push back element
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            stack.push(sc.nextInt());
        }

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
