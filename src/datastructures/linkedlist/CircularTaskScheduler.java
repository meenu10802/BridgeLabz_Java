package datastructure.linkedlist;

/*
3. Circular Linked List: Task Scheduler
Problem Statement: Create a task scheduler using a circular linked list. Each node in the list represents a task with Task ID, Task Name, Priority, and Due Date. Implement the following functionalities:
1. Add a task at the beginning, end, or at a specific position in the circular list.
2. Remove a task by Task ID.
3. View the current task and move to the next task in the circular list.
4. Display all tasks in the list starting from the head node.
5. Search for a task by Priority.
Hint:
● Use a circular linked list where the last node’s next pointer points back to the first node.
*/

class TaskNode {
    int taskId, priority;
    String taskName, dueDate;
    TaskNode next;

    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class CircularTaskScheduler {

    TaskNode head = null;

    // Add task at end
    void addTask(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    // Display all tasks
    void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        do {
            System.out.println(temp.taskId + " " + temp.taskName + " " +
                    temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        CircularTaskScheduler scheduler = new CircularTaskScheduler();

        scheduler.addTask(1, "Assignment", 1, "10-02-2026");
        scheduler.addTask(2, "Project", 2, "20-02-2026");

        scheduler.displayTasks();
    }
}
