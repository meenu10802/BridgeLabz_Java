package datastructure.linkedlist;

/*
6. Circular Linked List: Round Robin Scheduling Algorithm
Problem Statement: Implement a round-robin CPU scheduling algorithm using a circular linked list.
*/

class ProcessNode {
    int pid, burstTime;
    ProcessNode next;

    ProcessNode(int pid, int burstTime) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.next = null;
    }
}

public class RoundRobinScheduler {

    ProcessNode head = null;

    // Add process at end
    void addProcess(int pid, int burst) {
        ProcessNode newNode = new ProcessNode(pid, burst);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    // Display processes
    void display() {
        if (head == null) return;

        ProcessNode temp = head;
        do {
            System.out.println("PID: " + temp.pid + " Burst: " + temp.burstTime);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        RoundRobinScheduler rr = new RoundRobinScheduler();

        rr.addProcess(1, 5);
        rr.addProcess(2, 3);
        rr.addProcess(3, 8);

        rr.display();
    }
}
