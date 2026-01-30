package collectionsandstreams.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Reverse a queue using only queue operations
 */
public class ReverseQueueDemo {

    public static <T> void reverseQueue(Queue<T> queue) {
        if (queue.isEmpty()) {
            return;
        }
        T element = queue.remove();
        reverseQueue(queue);
        queue.add(element);
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverseQueue(queue);
        System.out.println(queue); // [30, 20, 10]
    }
}
